import java.util.*;

public class Restaurante {

    Scanner entrada = new Scanner(System.in);
    int conf,s,d,c,ce,b,p,pla;
    double pdes,pcom,pcen,pbeb,ppos,tot;
    boolean salir = false;


    public void Pedido()
    {
        
        System.out.printf("Hola, \n"+
        "¿deseas realizar un pedido?\n\n"+
        "1 --- si\n"+
        "2 --- no\n");
        conf=entrada.nextInt();
        if (conf == 1) {
            
        do {
        
        System.out.printf("¿Qué deseas? \n"+
        "1 --- Platillos para el desayuno\n"+
        "2 --- Platillos para la comida\n"+
        "3 --- Platillos para la cena\n"+
        "4 --- Bebidas\n"+
        "5 --- Postres\n\n"+
        "6 --- ¿Puedes darme la cuenta?\n\n");
        pla=entrada.nextInt();

            switch (pla) {
                case 1:
                System.out.printf("DESAYUNO\n\n"+"¿Qué desea pedir? \n"+
                "1 --- Chilaquiles --- $45\n"+
                "2 --- Huevos rancheros --- $40\n"+
                "3 --- Molletes --- $35\n"+
                "4 --- Enchiladas --- $45\n"+
                "5 --- Hot cakes --- $25\n"+
                "6 --- Bagel con salmón ahumado --- $42\n"+
                "7 --- Yogurt con frutas y granola --- $22\n"+
                "8 --- Waffles --- $45\n"+
                "9 --- Burritos --- $43\n"+
                "10 --- Tortitas de papa --- $45\n");
                d=entrada.nextInt();
                    switch (d) {
                        case 1:
                            pdes=45;
                            break;
                        case 2:
                            pdes=40;
                            break;
                        case 3:
                            pdes=35;
                        break;
                        case 4:
                            pdes=45;
                        break;
                        case 5:
                            pdes=25;
                        break;
                        case 6:
                            pdes=42;
                        break;
                        case 7:
                            pdes=22;
                        break;
                        case 8:
                            pdes=45;
                        break;
                        case 9:
                            pdes=43;
                        break;
                        case 10:
                            pdes=45;
                        break;
                    }
                    break;
                    
                case 2:
                System.out.printf("COMIDA\n\n"+"¿Qué desea pedir? \n"+
                "1 --- Mole poblano --- $45\n"+
                "2 --- Pozole --- $40\n"+
                "3 --- Chiles en nogada --- $40\n"+
                "4 --- Sopes --- $20\n"+
                "5 --- Filete mignon --- $55\n"+
                "6 --- Salmón al horno --- $60\n"+
                "7 --- Risotto de champiñones --- $45\n"+
                "8 --- Cordero asado --- $50\n"+
                "9 --- Raviolis de langosta --- $40\n"+
                "10 --- Pollo relleno de queso de cabra --- $55\n");
                c=entrada.nextInt();
                    switch (c) {
                        case 1:
                            pcom=45;
                            break;
                        case 2:
                            pcom=40;
                            break;
                        case 3:
                            pcom=40;
                        break;
                        case 4:
                            pcom=20;
                        break;
                        case 5:
                            pcom=55;
                        break;
                        case 6:
                            pcom=60;
                        break;
                        case 7:
                            pcom=45;
                        break;
                        case 8:
                            pcom=50;
                        break;
                        case 9:
                            pcom=40;
                        break;
                        case 10:
                            pcom=55;
                        break;

                    }
                    break;
                case 3:
                System.out.printf("CENA\n\n"+"¿Qué desea pedir?\n"+
                "1 --- Enchiladas Suizas --- $45\n"+
                "2 --- Chiles Rellenos --- $40\n"+
                "3 --- Sopa de Tortilla --- $35\n"+
                "4 --- Pescado a la Veracruzana --- $55\n"+
                "5 --- Lasaña de carne --- $44\n"+
                "6 --- Tostadas de camarones --- $45\n"+
                "7 --- Pasta con mariscos --- $45\n"+
                "8 --- Pollo a la parmesana --- $55\n"+
                "9 --- Tacos de carne asada --- $22\n"+
                "10 --- Pato a la naranja --- $60\n");
                ce=entrada.nextInt();
                    switch (ce) {
                        case 1:
                            pcen=45;
                            break;
                        case 2:
                            pcen=40;
                            break;
                        case 3:
                            pcen=35;
                        break;
                        case 4:
                            pcen=55;
                        break;
                        case 5:
                            pcen=44;
                        break;
                        case 6:
                            pcen=45;
                        break;
                        case 7:
                            pcen=45;
                        break;
                        case 8:
                            pcen=55;
                        break;
                        case 9:
                            pcen=22;
                        break;
                        case 10:
                            pcen=60;
                        break;
                    }
                    break;
                case 4:
                System.out.printf("BEBIDAS\n\n"+"¿Qué desea pedir? \n"+
                "1 --- Square --- $15\n"+
                "2 --- Sprite --- $15\n"+
                "3 --- Agua de Orchata (600ml) --- $12\n"+
                "4 --- Agua de Jamaica (600ml) --- $12\n"+
                "5 --- Limonada --- $18\n"+
                "6 --- Jugo de naranja --- $18\n"+
                "7 --- Capuchino --- $20\n"+
                "8 --- Chocolate caliente --- $22\n"+
                "9 --- Cerveza --- $35\n"+
                "10 --- Vino tinto --- $55\n");
                b=entrada.nextInt();
                    switch (b) {
                        case 1:
                            pbeb=15;
                            break;
                        case 2:
                            pbeb=15;
                            break;
                        case 3:
                            pbeb=12;
                        break;
                        case 4:
                            pbeb=12;
                        break;
                        case 5:
                            pbeb=18;
                        break;
                        case 6:
                            pbeb=18;
                        break;
                        case 7:
                            pbeb=20;
                        break;
                        case 8:
                            pbeb=22;
                        break;
                        case 9:
                            pbeb=35;
                        break;
                        case 10:
                            pbeb=55;
                        break;
                    }
                    break;
                case 5:
                    System.out.printf("POSTRES\n\n"+"¿Qué desea pedir? \n"+
                    "1 --- Flan --- $15\n"+
                    "2 --- Arroz con Leche --- $15\n"+
                    "3 --- Pastel tres leches con Chocolate --- $22\n"+
                    "4 --- Mangonada (600ml) --- $12\n"+
                    "5 --- Pay de limón --- $18\n"+
                    "6 --- Banana split --- $25\n"+
                    "7 --- Fresas con chocolate --- $25\n"+
                    "8 --- Tarta de manzana --- $12\n"+
                    "9 --- Cheesecake --- $22\n"+
                    "10 --- Flan napolitano --- $20\n");
                    p=entrada.nextInt();
                        switch (p) {
                            case 1:
                                ppos=15;
                                break;
                            case 2:
                                ppos=15;
                                break;
                            case 3:
                                ppos=22;
                            break;
                            case 4:
                                ppos=12;
                            break;
                            case 5:
                                ppos=18;
                            break;
                            case 6:
                                ppos=25;
                            break;
                            case 7:
                                ppos=25;
                            break;
                            case 8:
                                ppos=12;
                            break;
                            case 9:
                                ppos=22;
                            break;
                            case 10:
                                ppos=20;
                            break;
                        }
                        break; 
                        
                        
                case 6:
                salir=true;
                        break;
                default:
                System.out.printf("Gracias por visitar\n\n"+ 
                "Las Palmas");
                salir=true;
                    break;
                }
            } while (!salir);
    
        } else {
            System.out.printf("\nGracias por visitar\n\n"+ 
            "Las Palmas");
        }
    }

    public void des()
    {

        if (conf==1) {
            
        System.out.printf("\n\nLAS PALMAS\n\n"+
        "Dirección: Av. Las Torres, local 11\n"+
        "Teléfono: 722-894-7811\n\n"+
        "*************************************************\n"+
        "Descripción       Precio\n"+
        "");
        switch (d) {
            case 1:
            System.out.println("Chilaquiles --- $45\n");
                break;
            case 2:
            System.out.println("Huevos rancheros --- $40\n");
            break;
            case 3:
            System.out.println("Molletes --- $35\n");
            break;
            case 4:
            System.out.println("Enchiladas --- $45\n");
            break;
            case 5:
            System.out.println("Hot cakes --- $25\n");
            break;
            case 6:
            System.out.println("Bagel con salmón ahumado --- $42\n");
            break;
            case 7:
            System.out.println("Yogurt con frutas y granola --- $22\n");
            break;
            case 8:
            System.out.println("Waffles --- $45\n");
            break;
            case 9:
            System.out.println("Burritos --- $43\n");
            break;
            case 10:
            System.out.println("Tortitas de papa --- $45\n\n");
            break;
                }
        
            }
        }

    public void com()
    {
        switch (c) {
            case 1:
            System.out.println("Mole poblano --- $45\n");
                break;
            case 2:
            System.out.println("Pozole --- $40\n");
            break;
            case 3:
            System.out.println("Chiles en nogada --- $40\n");
            break;
            case 4:
            System.out.println("Sopes --- $20\n");
            break;
            case 5:
            System.out.println("Hot cakes --- $25\n");
            break;
            case 6:
            System.out.println("Salmón al horno --- $60\n");
            break;
            case 7:
            System.out.println("Risotto de champiñones --- $45\n");
            break;
            case 8:
            System.out.println("Cordero asado --- $50\n");
            break;
            case 9:
            System.out.println("Raviolis de langosta --- $40\n");
            break;
            case 10:
            System.out.println("Pollo relleno de queso de cabra --- $55\n\n");
            break;
                }
    }

    public void cen()
    {
        switch (ce) {
            case 1:
            System.out.println("Enchiladas Suizas --- $45\n");
                break;
            case 2:
            System.out.println("Chiles Rellenos --- $40\n");
            break;
            case 3:
            System.out.println("Sopa de Tortilla --- $35\n");
            break;
            case 4:
            System.out.println("Pescado a la Veracruzana --- $55\n");
            break;
            case 5:
            System.out.println("Lasaña de carne --- $44\n");
            break;
            case 6:
            System.out.println("Tostadas de camarones --- $45\n");
            break;
            case 7:
            System.out.println("Pasta con mariscos --- $45\n");
            break;
            case 8:
            System.out.println("Pollo a la parmesana --- $55\n");
            break;
            case 9:
            System.out.println("Tacos de carne asada --- $22\n");
            break;
            case 10:
            System.out.println("Pato a la naranja --- $60\n\n");
            break;
                }
    }

    public void beb()
    {
        switch (b) {
            case 1:
            System.out.println("Square --- $15\n");
                break;
            case 2:
            System.out.println("Sprite --- $15\n");
            break;
            case 3:
            System.out.println("Agua de Orchata (600ml) --- $12\n");
            break;
            case 4:
            System.out.println("Agua de Jamaica (600ml) --- $12\n");
            break;
            case 5:
            System.out.println("Limonada --- $18\n");
            break;
            case 6:
            System.out.println("Jugo de naranja --- $18\n");
            break;
            case 7:
            System.out.println("Capuchino --- $20\n");
            break;
            case 8:
            System.out.println("Chocolate caliente --- $\n");
            break;
            case 9:
            System.out.println("Cerveza --- $35\n");
            break;
            case 10:
            System.out.println("Vino tinto --- $55\n\n");
            break;
                }
    }
 
    public void pos()
    {
        switch (p) {
            case 1:
            System.out.println("Flan --- $15\n");
                break;
            case 2:
            System.out.println("Arroz con Leche --- $15\n");
            break;
            case 3:
            System.out.println("Pastel tres leches con Chocolate --- $22\n");
            break;
            case 4:
            System.out.println("Mangonada (600ml) --- $12\n");
            break;
            case 5:
            System.out.println("Pay de limón --- $18\n");
            break;
            case 6:
            System.out.println("Banana split --- $25\n");
            break;
            case 7:
            System.out.println("Fresas con chocolate --- $25\n");
            break;
            case 8:
            System.out.println("Tarta de manzana --- $12\n");
            break;
            case 9:
            System.out.println("Cheesecake --- $22\n");
            break;
            case 10:
            System.out.println("Flan napolitano --- $20\n");
            break;
                }
    }

    public void Totales()
    {
        tot=pdes+pcom+pcen+pbeb+ppos;
        System.out.println("TOTAL ---- $"+tot+" \n");

        System.out.println("¡GRACIAS POR SU COMPRA!\n"+
        "VUELVA PRONTO");
    }
    public static void main(String[] args) {
        Restaurante rune = new Restaurante();
        rune.Pedido();
        rune.des();
        rune.com();
        rune.cen();
        rune.beb();
        rune.pos();
        rune.Totales();
    }
}
