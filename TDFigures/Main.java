package TDFigures;

public class Main {
    public static void main(String[] args) {
        Figure2D[] figures = new Figure2D[3];
        figures[0] = new Rectangle(2, 3);
        figures[1] = new Cercle(2);
        figures[2] = new Carre(5);
        for (Figure2D figure : figures) {
            System.out.println(figure);
        }

        System.out.println("aire rectangle" + figures[0].aire() + " m2");
        System.out.println("perimetre rectangle" + figures[0].perimetre());
        System.out.println("aire cercle" + figures[1].aire());
        System.out.println("perimetre cercle" + figures[1].perimetre());
        System.out.println("aire carre" + figures[2].aire() + " m2");
        System.out.println("perimetre carre" + figures[2].perimetre());
    }
}
