/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

/**
 *
 * @author ananghanafi
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager("anang", 15);
        SoftwareEngineer se = new SoftwareEngineer("hanafi", 8);
        System.out.println("Project Manager: "+pm.getNama());
        System.out.println("Lama kerja: "+pm.getLamaKerja()+" tahun");
        System.out.println("Gaji: "+pm.getGaji());
        System.out.println("");
        System.out.println("Software Engineer: "+se.getNama());
        System.out.println("Lama kerja: "+se.getLamaKerja()+" tahun");
        System.out.println("Gaji: "+se.getGaji());
        
    }
    
}
