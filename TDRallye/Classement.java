package TDRallye;

import java.util.List;
import java.util.ArrayList;

public class Classement {
    private ArrayList<Voiture> voitures;
    private ArrayList<Course> courses;

    public Classement() {
        voitures = new ArrayList<>();
        courses = new ArrayList<>();
    }

    // Ajouter une voiture à la liste de voitures
    public void ajouterVoiture(Voiture voiture) {
        voitures.add(voiture);
    }

    // Ajouter une course à la liste de courses
    public void ajouterCourse(Course course) {
        courses.add(course);
    }

    /**
     * Cette fonction calcule le temps que chaque voiture a mis pour chaque course.
     * @return Un tableau de tableaux où le temps de chaque voiture pour chaque course est stocké.
     */
    public int[][] calculerTempsCourses() {
        int nombreVoitures = voitures.size();
        int nombreCourses = courses.size();
        int[][] tempsCourses = new int[0][0];

        for (int i = 0; i < nombreVoitures; i++) {
            Voiture voiture = voitures.get(i);
            for (int j = 0; j < nombreCourses; j++) {
                Course course = courses.get(j);
                //tempsCourses[i][j] = ;
            }
        }

        return tempsCourses;
    }

}
