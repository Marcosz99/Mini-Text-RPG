package game;

public class Loja
{

    private String nome;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int hp;
    private int xp;
    private int gold;
    private Loja efeitoEspecial;
    private Jogador jogador;
    private int preço;

    Equipamentos equipamentos = new Equipamentos();

    public void venderElmoCouroReforcado(Jogador jogador, Inventario inventario)
    {
        int preco = 12;
        if (jogador.getGold() >= preco)
        {
            jogador.setGold(jogador.getGold() - preco);
            inventario.adicionarEquipamento(elmoCouroReforcado);
            jogador.setAdquiriuArmadura("Elmo De Couro Reforcado");
            if (jogador.getElmo() == null)
            {
                jogador.setElmo(elmoCouroReforcado);
                System.out.println("Ja equipamos seu novo equipamento! \n");
            } else {
                jogador.setElmo(elmoCouroReforcado);
                System.out.println("Vimos que vc ja tinha armadura e a Substituímos\n"
                        + "Sua antiga armadura encontra-se no inventario\n");
            }
        } else {
            System.out.println("Voce nao tem dinheiro suficiente \n");
        }
    }
    
    public void venderPeitoralCouroReforcado(Jogador jogador, Inventario inventario)
    {
        int preco = 20;
        if (jogador.getGold() >= preco)
        {
            jogador.setGold(jogador.getGold() - preco);
            inventario.adicionarEquipamento(peitoralCouroReforcado);
            jogador.setAdquiriuArmadura("Peitoral De Couro Reforçado");
            if (jogador.getPeitoral()== null)
            {
                jogador.setPeitoral(peitoralCouroReforcado);
                System.out.println("Ja equipamos seu novo equipamento! \n");
            } else {
                jogador.setElmo(peitoralCouroReforcado);
                System.out.println("Vimos que vc ja tinha armadura e a Substituímos\n"
                        + "Sua antiga armadura encontra-se no inventario\n");
            }
        } else {
            System.out.println("Voce nao tem dinheiro suficiente \n");
        }
    }

    public void venderPerneirasCouroReforcado(Jogador jogador, Inventario inventario)
    {
        int preco = 16;
        if (jogador.getGold() >= preco)
        {
            jogador.setGold(jogador.getGold() - preco);
            inventario.adicionarEquipamento(perneirasCouroReforcado);
            jogador.setAdquiriuArmadura("Perneira De Couro Reforçado");
            if (jogador.getPerneiras() == null)
            {
                jogador.setPerneiras(perneirasCouroReforcado);
                System.out.println("Ja equipamos seu novo equipamento! \n");
            } else {
                jogador.setElmo(perneirasCouroReforcado);
                System.out.println("Vimos que vc ja tinha armadura e a Substituímos\n"
                        + " Sua antiga armadura encontra-se no inventario\n");
            }
        } else {
            System.out.println("Voce nao tem dinheiro suficiente \n");
        }
    }

    public void venderBotasCouroReforcado(Jogador jogador, Inventario inventario)
    {
        int preco = 12;
        if (jogador.getGold() >= preco)
        {
            jogador.setGold(jogador.getGold() - preco);
            inventario.adicionarEquipamento(botasCouroReforcado);
            jogador.setAdquiriuArmadura("Bota De Couro Reforçado");
            if (jogador.getBotas() == null)
            {
                jogador.setBotas(botasCouroReforcado);
                System.out.println("Ja equipamos seu novo equipamento! \n");
            } else {
                jogador.setElmo(botasCouroReforcado);
                System.out.println("Vimos que vc ja tinha armadura e a Substituímos\n"
                        + "Sua antiga armadura encontra-se no inventario\n");
            }
        } else {
            System.out.println("Voce nao tem dinheiro suficiente \n");
        }
    }
    
    public void venderElmoEscaravelhoDourado(Jogador jogador, Inventario inventario)
    {
    int preco = 20;
    if (jogador.getGold() >= preco)
    {
        jogador.setGold(jogador.getGold() - preco);
        inventario.adicionarEquipamento(elmoEscaravelhoDourado);
            jogador.setAdquiriuArmadura("Elmo Escaravelho Dourado");
        if (jogador.getElmo() == null)
        {
            jogador.setElmo(elmoEscaravelhoDourado);
            System.out.println("Ja equipamos seu novo equipamento! \n");
        } else {
                jogador.setElmo(elmoEscaravelhoDourado);
                System.out.println("Vimos que vc ja tinha armadura e a Substituímos\n"
                        + "Sua antiga armadura encontra-se no inventario\n");
            }
        } else {
            System.out.println("Voce nao tem dinheiro suficiente \n");
        }
    }
    
    public String vendaNegada()
    {
        return String.format("\nNao foi possivel realizar sua compra!\n");
    }
    
    
    Equipamentos elmoCouroReforcado = new Equipamentos("Elmo Couro Reforçado",
            2, 2, 2, 2);

    Equipamentos peitoralCouroReforcado = new Equipamentos("Peitoral Couro Reforçado",
            2, 2, 2, 2);

    Equipamentos perneirasCouroReforcado = new Equipamentos("Perneiras Couro Reforçadoo",
            2, 2, 2, 2);

    Equipamentos botasCouroReforcado = new Equipamentos("Botas Couro Reforçado",
            2, 2, 2, 2);
    
    

    Equipamentos elmoEscaravelhoDourado = new Equipamentos("Elmo Escaravelho Dourado",
            2, 2, 2, 2);

    Equipamentos peitoralEscaravelhoDourado = new Equipamentos("Peitoral Escaravelho Dourado",
            2, 2, 2, 2);

    Equipamentos perneirasEscaravelhoDourado = new Equipamentos("Perneiras Escaravelho Dourado",
            2, 2, 2, 2);

    Equipamentos botasEscaravelhoDourado = new Equipamentos("Botas Escaravelho Dourado",
            2, 2, 2, 2);
    
    

    Equipamentos elmoEscamasDeDragao = new Equipamentos("Elmo Escamas de Dragão",
            2, 2, 2, 2);

    Equipamentos peitoralEscamasDeDragao = new Equipamentos("Peitoral Escamas de Dragão",
            2, 2, 2, 2);

    Equipamentos perneirasEscamasDeDragao = new Equipamentos("Perneiras Escamas de Dragão",
            2, 2, 2, 2);

    Equipamentos botasEscamasDeDragao = new Equipamentos("Botas Escamas de Dragão",
            2, 2, 2, 2);
    
    

    Equipamentos elmoVidroEncantado = new Equipamentos("Elmo Vidro Encantado",
            2, 2, 2, 2);

    Equipamentos peitoralVidroEncantado = new Equipamentos("Peitoral Vidro Encantado",
            2, 2, 2, 2);

    Equipamentos perneirasVidroEncantado = new Equipamentos("Perneiras Vidro Encantado",
            2, 2, 2, 2);
    Equipamentos botasVidroEncantado = new Equipamentos("Botas Vidro Encantado",
            2, 2, 2, 2);
    
    

    Equipamentos elmoHeroiAncestral = new Equipamentos("Elmo Herói Ancestral",
            2, 2, 2, 2);

    Equipamentos peitoralHeroiAncestral = new Equipamentos("Peitoral Herói Ancestral",
            2, 2, 2, 2);

    Equipamentos perneirasHeroiAncestral = new Equipamentos("Perneiras Herói Ancestral",
            2, 2, 2, 2);

    Equipamentos botasHeroiAncestral = new Equipamentos("Botas Herói Ancestral",
            2, 2, 2, 2);
    
    

    // ATAQUE================ATAQUE===================ATAQUE====================ATAQUEE \\
    
    
    Equipamentos espadaDeMadeira = new Equipamentos("Espada de madeira",
            2, 2, 2, 2);

    Equipamentos espadaOssosRuidos = new Equipamentos("Espada Ossos ruídos",
            2, 2, 2, 2);

    Equipamentos espadaDeAco = new Equipamentos("Espada de Aço",
            2, 2, 2, 2);

    Equipamentos espadaDragaoSanguinario = new Equipamentos("Espada Dragão Sanguinário",
            2, 2, 2, 2);

    Equipamentos espadaLuzRadiante = new Equipamentos("Espada Luz Radiante",
            2, 2, 2, 2);
    
    

    // ESCUDO================ESCUDO===================ESCUDO====================ESCUDO \\
    
    
    Equipamentos escudoDeMadeiraRobusto = new Equipamentos("Escudo de Madeira Robusto",
            2, 2, 2, 2);

}
