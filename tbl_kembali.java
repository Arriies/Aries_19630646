/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Date;

public class tbl_kembali {
    private int no_kembali;
    private int no_sj;
    private Date tgl_kembali;
  

    public tbl_kembali(int no_kembali, int no_sj, Date tgl_kembali) {
        this.no_kembali = no_kembali;
        this.no_sj = no_sj;
        this.tgl_kembali = tgl_kembali;
    }

    // Getter dan setter untuk setiap atribut

    public int getno_kembali() {
        return no_kembali;
    }

    public void setno_kembali(int no_kembali) {
        this.no_kembali = no_kembali;
    }

    public int getno_sj() {
        return no_sj;
    }

    public void setno_sj(int no_sj) {
        this.no_sj = no_sj;
    }

    
    public Date gettgl_kembali() {
        return tgl_kembali;
    }

    public void settgl_kembali(Date tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }
}
