package Model;

import Entity.KorbanEntity;
import java.util.ArrayList;


public class KorbanModel implements Interfaces {
    private ArrayList<KorbanEntity> korbanEntityArrayList;
    
    public KorbanModel(){
        korbanEntityArrayList = new ArrayList<KorbanEntity>();
    }
public void insert(KorbanEntity korban){
    korbanEntityArrayList.add(korban);  
}

    @Override
 public void login(){
        for(KorbanEntity korbanEntity : korbanEntityArrayList){
            System.out.println("===========================================");
            System.out.println(" NIK : "+korbanEntity.getNik()+"\n Nama : "
            +korbanEntity.getNama()+"\n Pekerjaan : "+korbanEntity.getPekerjaan()+
            "\n Golongan Darah : "+korbanEntity.getGoldarah()+"\n Agama : "+korbanEntity.getAgama()+
            "\n Jenis Kelamin : "+korbanEntity.getJeniskelamin()+"\n No Telp : "
            +korbanEntity.getNotelp()+"\n Tanggal Lahir : "+korbanEntity.getTglLahir());
            System.out.println("===========================================");
        }
    }
 public int cekData(String nik, String nama){
        int loop = 0;
        while (!korbanEntityArrayList.get(loop).getNik().equals(nik) && 
                !korbanEntityArrayList.get(loop).getNama().equals(nama)){
            loop++;
        }
        return loop;
    }
    public KorbanEntity getkorbanEntityArrayList(int index){
        return korbanEntityArrayList.get(index);
    }
    private int carinik(String nik){
        int index=-1;
        for(int i=0;i <korbanEntityArrayList.size();i++) {
           if(nik.equals(korbanEntityArrayList.get(i).getNik()))
               index=i;
           break;
       }
       return index;
    }
    public int hapus(String nik){
            int data;
        if(carinik(nik)!=-1){
             korbanEntityArrayList.remove(carinik(nik));
             data=1;
        }else{
            data=0;
          }        
        return data;
    }
}

