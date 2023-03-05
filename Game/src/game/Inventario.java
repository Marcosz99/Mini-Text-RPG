package game;

import java.util.ArrayList;

public class Inventario
{

    private Equipamentos elmoSlot;
    private Equipamentos peitoralSlot;
    private Equipamentos perneirasSlot;
    private Equipamentos botasSlot;

    private ArrayList<Inventario> itens;
    private ArrayList<Equipamentos> equipamentos;

    // INVENTARIO \\             // INVENTARIO \\              // INVENTARIO \\         // INVENTARIO \\
    public Inventario()
    {
        equipamentos = new ArrayList<Equipamentos>();
    }

    public void adicionarItem(Inventario item)
    {
        itens.add(item);
    }

    public void removerItem(Inventario item)
    {
        itens.remove(item);
    }

    // EQUIPAMENTO \\          // EQUIPAMENTO \\            // EQUIPAMENTO \\          // EQUIPAMENTO \\
    public void adicionarEquipamento(Equipamentos equipamento)
    {
        equipamentos.add(equipamento);
    }

    public void removerEquipamento(Equipamentos equipamento)
    {
        equipamentos.remove(equipamento);
    }

    public void percorrerEquipamentos()
    {
        for (Equipamentos equipamentos : equipamentos)
        {
            // Realize alguma ação com o item, como imprimir seu nome:
            System.out.println(equipamentos.getNome());
        }
    }
}
