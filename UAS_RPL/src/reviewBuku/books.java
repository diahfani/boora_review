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
public class books extends users{
    private String judul;
    private int id_buku;
    private int tahun_terbit;
    private String author;
    private String genre;
    private String deskripsi;
    private String komentar;
    private byte[] cover;
    
    public books(){}
    
    public books(int id_buku, String judul, int tahun_terbit, String author, String genre, String deskripsi, byte[] cover){
        this.id_buku = id_buku;
        this.judul= judul;
        this.tahun_terbit = tahun_terbit;
        this.author = author;
        this.genre = genre;
        this.deskripsi = deskripsi;
        this.cover = cover;
    }

    books(byte aByte, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    books(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdBuku(){
        return id_buku;
    }
    
    public void setIdBuku(int id_buku){
        this.id_buku = id_buku;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public int getTahunTerbit(){
        return tahun_terbit;
    }
    
    public void setTahunTerbit(int tahun_terbit){
        this.tahun_terbit = tahun_terbit;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getDeskripsi(){
        return deskripsi;
    }
    
    public byte[] getCover(){
        return cover;
    }
    
    public void setCover(byte[] cover){
        this.cover = cover;
    }
}
