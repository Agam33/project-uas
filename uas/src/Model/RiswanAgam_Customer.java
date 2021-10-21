
package Model;

/**
 *
 * @author Riswan Agam
 * @NIM 191011400122
 * @Tugas UAS
 */
public class RiswanAgam_Customer {
    private int id;
    private long totalUang;
    private String nama;
    private String NIM;
    private String noTlp;
    private String pekerjaan;
    
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public long getTotalUang() {
        return totalUang;
    }
    public void setTotalUang(long totalUang) {
        this.totalUang = totalUang;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public String getNoTlp() {
        return noTlp;
    }
    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }
    @Override
    public String toString() {
        return "RiswanAgam_Customer{" + "id=" + id + ", totalUang=" + totalUang + ", nama=" + nama + ", NIM=" + NIM + ", noTlp=" + noTlp + ", pekerjaan=" + pekerjaan + '}';
    }
    
}
