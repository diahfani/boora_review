/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewBuku;

/**
 *
 * @author Admin
 */
public class users {
    private String nama_lengkap;
    private String username;
    private String tgl_lahir;
    private String password;
    private String gender;
    
    public users(){}
    
    public users(String nama_lengkap, String username, String tgl_lahir, String password, String gender){
        this.nama_lengkap = nama_lengkap;
        this.username = username;
        this.tgl_lahir = tgl_lahir;
        this.password = password;
        this.gender = gender;
    }
    
    public String getNamaLengkap(){
        return nama_lengkap;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getTglLahir(){
        return tgl_lahir;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
   
}
