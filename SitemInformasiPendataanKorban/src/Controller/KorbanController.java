package Controller;

import Entity.DataKorbanEntity;
import Entity.KorbanEntity;
import java.util.Date;

public class KorbanController implements Interfaces {
     int indexLogin=0;
    
        
    public KorbanEntity getData(){
        return AllObjectModel.korbanModel.getkorbanEntityArrayList(indexLogin);
       }
    
    public void daftarstatus (int indexStatus, KorbanEntity korban){
       AllObjectModel.datakorbanModel.insertDataDataKorban(new DataKorbanEntity(indexStatus,korban));
    }
    
    @Override
    public void login (String nik , String nama){
        indexLogin = AllObjectModel.korbanModel.cekData(nik, nama);
    }
      
    public void insert (String nik, String nama, String pekerjaan,String goldarah,String agama,
               String jeniskelamin, String notelp, Date TglLahir, String bantuan){
       AllObjectModel.korbanModel.insert(new KorbanEntity(nik,nama,pekerjaan,goldarah,
            agama,jeniskelamin, notelp, TglLahir,bantuan));
    }
    
     public KorbanEntity korban(){
        return AllObjectModel.korbanModel.getkorbanEntityArrayList(indexLogin);
    }
    
    public int cekDataKorban(String nik){
        int cek = AllObjectModel.datakorbanModel.cekData(nik, null);
        return cek;
    }
    
    public DataKorbanEntity showDataKorban (int index){
        return AllObjectModel.datakorbanModel.showDataKorban(index);
    }

    public int update(String nik, int statusbaru) {
       return AllObjectModel.datakorbanModel.update(nik, statusbaru);
    }
    
    public int hapus(String nik){
      return AllObjectModel.korbanModel.hapus(nik);
    }
}
