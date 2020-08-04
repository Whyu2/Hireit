/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.ArrayList;
import model.DataPosting;
import model.PostingModel;

import view.TambahPostingan;


/**
 *
 * @author MELON
 */
public class PostingController {
    private TambahPostingan PostingView;
    private PostingModel postingmodel;
    private DataPosting dataposting;
    

    
    public PostingController (TambahPostingan PostingView){
    postingmodel = new PostingModel();
    }
    
    public void DataPosting(String deskripsi,String judulposting, String pays,String cilent,String namaperusahaan,String location,String email,String contact, String deadline,String logo){
    postingmodel.setDeskripsi (deskripsi);
    postingmodel.setJudulposting (judulposting); 
    postingmodel.setPays (pays);  
    postingmodel.setCilent (cilent);  
    postingmodel.setNamaperusahaan (namaperusahaan);  
    postingmodel.setLocation (location);  
    postingmodel.setEmail (email);
    postingmodel.setContact (contact);  
    postingmodel.setDeadline(deadline);  
    postingmodel.setLogo(logo);

    }
     public boolean InsertPosting(){
     return postingmodel.InsertPosting();
}
 //
           //isi field
    
     
}