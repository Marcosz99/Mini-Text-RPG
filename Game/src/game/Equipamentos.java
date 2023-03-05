package game;

import java.util.ArrayList;

public class Equipamentos
{

    private String nome;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int hp;
    private int xp;
    private int gold;

    // private ArrayList<Equipamentos> equip;
    public Equipamentos()
    {
    }

    public Equipamentos(String nome, int ataque, int defesa, int velocidade, int hp)
    {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.hp = hp;
        int efeitoMaleavel;
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
