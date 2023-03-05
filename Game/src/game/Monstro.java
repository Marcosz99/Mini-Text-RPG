package game;

public class Monstro
{

    private String nome;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int hp;
    private int xp;
    private int gold;

    public Monstro(String nome, int ataque, int defesa, int velocidade, int hp, int xp, int gold)
    {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.hp = hp;
        this.xp = xp;
        this.gold = gold;
    }

    public void atacar(Jogador jogador)
    {
        int dano = ataque - (jogador.getDefesa() / 4);
        if (dano > 0 && jogador.getHp() > 0)
        {
            jogador.receberDano(dano);
            System.out.println("O " + nome + " causou " + dano + " de dano a voce!");
        } else
        {
            System.out.println("O ataque do " + nome + " nao causou dano a voce!");
        }
    }

    public void receberDano(int dano, Jogador jogador)
    {
        hp -= dano;
        System.out.println();
//      System.out.println("O " + nome + " recebeu " + dano + " de dano!");
        if (hp <= 0)
        {
            System.out.println("Voce derrotou o " + nome + "!");
            concederStatus(jogador);
            jogador.validarXp(2 * (jogador.getNivel() + 1));
        }
    }

    public void concederStatus(Jogador jogador)
    {
        jogador.setXp(jogador.getXp() + xp);
        jogador.setGold(jogador.getGold() + gold);
        System.out.println("Voce ganhou " + xp + " de XP " + gold + " de Gold!\n");
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

}
