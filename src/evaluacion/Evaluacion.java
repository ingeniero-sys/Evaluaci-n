/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;
import java.util.Scanner;
/**
 *
 * @author pabli
 */
public class Evaluacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Solicitar al usuario los porcentajes
  Scanner scanner = new Scanner(System.in);

        // Solicitar al profesor los porcentajes
        System.out.print("Ingrese el porcentaje de la evaluación continua: ");
        double porcentajeEvaluacionContinua = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje del examen: ");
        double porcentajeExamen = scanner.nextDouble();

        // Validar que la suma de los porcentajes sea 100
        if (porcentajeEvaluacionContinua + porcentajeExamen != 100) {
            System.out.println("Error: La suma de los porcentajes debe ser 100.");
            return;
        }

        // Convertir los porcentajes a decimal
        porcentajeEvaluacionContinua /= 100;
        porcentajeExamen /= 100;

        // Imprimir información para el profesor
        System.out.println("\nConfiguración del profesor:");
        System.out.println("Porcentaje de evaluación continua: " + porcentajeEvaluacionContinua * 100 + "%");
        System.out.println("Porcentaje de examen: " + porcentajeExamen * 100 + "%");

        // Solicitar al profesor el número de trabajos y aciertos
        System.out.print("\nIngrese el número de trabajos realizados por los alumnos: ");
        int totalTrabajos = scanner.nextInt();

        System.out.print("Ingrese el número total de aciertos en el examen por los alumnos: ");
        int totalAciertos = scanner.nextInt();

        // Solicitar al alumno los trabajos y aciertos
        System.out.print("\nIngrese su número de trabajos realizados: ");
        int trabajosRealizados = scanner.nextInt();

        System.out.print("Ingrese su número de aciertos en el examen: ");
        int aciertosExamen = scanner.nextInt();

        // Calcular evaluación continua y examen para el alumno respetando los porcentajes del profesor
        double evaluacionContinua =  totalTrabajos * porcentajeEvaluacionContinua / trabajosRealizados;
        double examen =   totalAciertos * porcentajeExamen/aciertosExamen;
        double promedio = evaluacionContinua + examen ;

        double porcentaje = evaluacionContinua* 100;
        double porcentaje2 = examen* 100;
        double porcentaje3 = promedio* 100;
        long porcentajeRedondeado1 = Math.round(porcentaje);
        long porcentajeRedondeado2 = Math.round(porcentaje2);
        long porcentajeRedondeado3 = Math.round(porcentaje3);
        // Calcular y mostrar el promedio del alumno
        
        // Imprimir información para el alumno
        System.out.println("\nDesempeño del alumno:");
        System.out.println("Porcentaje de evaluación continua: " + porcentajeRedondeado1 + "%");
        System.out.println("Porcentaje de examen: " + porcentajeRedondeado2 + "%");
        System.out.println("Promedio: " + porcentajeRedondeado3);
       
    }
    
}
