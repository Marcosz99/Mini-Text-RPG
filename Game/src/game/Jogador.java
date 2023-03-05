package game;

import java.util.Random;

public class Jogador
{

    private String nome;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int hp;
    private int xp;
    private int gold;
    private int nivel;
    private Equipamentos elmoSlot;
    private Equipamentos peitoralSlot;
    private Equipamentos perneirasSlot;
    private Equipamentos botasSlot;
    private Equipamentos espadaSlot;

    public Jogador(String nome)
    {
        this.nome = nome;
        this.ataque = 5;
        this.defesa = 4;
        this.velocidade = 3;
        this.hp = 25;
        this.xp = 5;
        this.gold = 0;
    }

    Random random = new Random();

 
    public void atacar(Monstro monstro)
    {
        int dano = ataque - (monstro.getDefesa() / 2);
        if (dano > 0 && monstro.getHp() > 0)
        {
            monstro.receberDano(dano, this);
            System.out.println("Voce causou " + dano + " de dano ao " + monstro.getNome() + "!");
        } else
        {
            System.out.println("Seu ataque nao causou dano ao " + monstro.getNome() + "!");
        }
    }

    public void receberDano(int dano)
    {
        hp -= dano;
//      System.out.println("Você recebeu " + dano + " de dano!");
        if (hp <= 0)
        {
            System.out.println("Você foi derrotado, voltaste a vida porem extremamente fraco\n");
            setNivel(1);
            setAtaque(5);
            setDefesa(4);
            setVelocidade(4);
            setHp(15);
//             TA COM LOOPING RESOLVI TERIMAR O PROJETO ENTÂO NAO ARRUMEI!!
        }
    }

    public void statusNivel(int ataque, int defesa, int velocidade, int hp)
    {
        this.ataque += ataque;
        this.defesa += defesa;
        this.velocidade += velocidade;
        this.hp += hp;
        this.nivel += 1;
        System.out.println(
                "\nVoce subiu de nivel, Seus atributos atuais agora sao: " + "\nataque: " + getAtaque() + "\ndefesa: "
                + getDefesa() + "\nvelocidade: " + getVelocidade() + "\nhp: " + getHp() + "\n");
    }

    public void nivelUP()
    {
        this.nivel += 1;
        statusNivel(2 + random.nextInt(3), 1 + random.nextInt(2),
                2 + random.nextInt(2), 15 + random.nextInt(12));

    }

    public void validarXp(int xpUp)
    {
        if (this.xp >= xpUp)
        {
            nivelUP();
            this.xp = 0;
        }
    }

    public String xpRestanteParaProximoNivel()
    {
        if (nivel == 0)
        {
            return String.format("Conclua uma batalha para evoluir seu primeiro nivel");
        } else
        {
            return String.format("Faltam " + 2 * (nivel + 1) + "XP Para evoluir:");
        }

    }

    public void setElmo(Equipamentos elmo)
    {
        setAtaque(getAtaque() + elmo.getAtaque());
        setDefesa(getDefesa() + elmo.getDefesa());
        setVelocidade(getVelocidade() + elmo.getVelocidade());
        setHp(getHp() + elmo.getHp());
        this.elmoSlot = elmo;
    }

        public String getArmaduraFull()
    {
        String resultado = "";

        if (elmoSlot == null)
        {
            resultado += "Nenhum Elmo equipado\n";
        } else
        {
            resultado += "Equipado com " + elmoSlot.getNome() + "\n";
        }

        if (peitoralSlot == null)
        {
            resultado += "Nenhum Peitoral equipado\n";
        } else
        {
            resultado += "Equipado com " + peitoralSlot + "\n";
        }

        if (perneirasSlot == null)
        {
            resultado += "Nenhuma perneira equipada\n";
        } else
        {
            resultado += "Equipado com " + perneirasSlot + "\n";
        }

        if (botasSlot == null)
        {
            resultado += "Nenhuma bota equipada\n";
        } else
        {
            resultado += "Equipado com " + botasSlot + "\n";
        }

        return resultado;
    }

    public String setAdquiriuArmadura(String nome)
    {
          return String.format("Adquiriu " + nome);  
    }

    public String verStatusAtual()
    {
        return String.format("\nAtaque: " + getAtaque() + "\nDefesa: "
                + getDefesa() + "\nVelocidade: " + getVelocidade() + "\nHp: " + getHp());

    }
    
    public void setPeitoral(Equipamentos peitoral)
    {
        this.peitoralSlot = peitoral;
    }

    public void setPerneiras(Equipamentos perneiras)
    {
        this.perneirasSlot = perneiras;
    }

    public void setBotas(Equipamentos botas)
    {
        this.botasSlot = botas;
    }

    public void setEspada(Equipamentos espada)
    {
        this.espadaSlot = espada;
    }

    public void receberXp(Monstro monstro)
    {
        this.xp += monstro.getXp();
    }

    public void receberGold(Monstro monstro)
    {
        this.gold += monstro.getGold();
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setAtaque(int ataque)
    {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa)
    {
        this.defesa = defesa;
    }

    public void setVelocidade(int velocidade)
    {
        this.velocidade = velocidade;
    }
    
    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public String getNome()
    {
        return nome;
    }

    public int getAtaque()
    {
        return ataque;
    }

    public int getDefesa()
    {
        return defesa;
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    public int getHp()
    {
        return hp;
    }
    
    public int getXp()
    {
        return xp;
    }

    public int getGold()
    {
        return gold;
    }

    public int getNivel()
    {
        return nivel;
    }

    public Equipamentos getElmo()
    {
        return elmoSlot;
    }

    public Equipamentos getPeitoral()
    {
        return peitoralSlot;
    }

    public Equipamentos getPerneiras()
    {
        return perneirasSlot;
    }

    public Equipamentos getBotas()
    {
        return botasSlot;
    }
    
}
