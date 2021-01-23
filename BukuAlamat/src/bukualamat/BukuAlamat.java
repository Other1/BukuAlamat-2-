/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

import bukualamat.model.DataPersonal;
import bukualamat.view.ViewBukuAlamatController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Another
 */
public class BukuAlamat extends Application {
    private Stage stageAplikasi;
    private BorderPane rootAplikasi;
    private ObservableList<DataPersonal> dataperson = FXCollections.observableArrayList();
    
    public BukuAlamat(){
        dataperson.add(new DataPersonal("Budi","Santoso"));
        dataperson.add(new DataPersonal("Ahmad","Dahlan"));
        dataperson.add(new DataPersonal("Hasyim","Asy'ari"));
        dataperson.add(new DataPersonal("Anies","Baswedan"));
        dataperson.add(new DataPersonal("Ridwan","Kamil"));
    }
    
    public ObservableList<DataPersonal> getDataPersonal(){
        return dataperson;
    }
    
    @Override
    public void start(Stage primaryStage){
        this.stageAplikasi = primaryStage;
        this.stageAplikasi.setTitle("Buku Alamat");
        
        initGuiKerangka();
        initViewBukuAlamat();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void initGuiKerangka() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(BukuAlamat.class.getResource("view/GuiKerangka.fxml"));
            rootAplikasi = (BorderPane)loader.load();
            
            Scene sceneAplikasi = new Scene(rootAplikasi);
            stageAplikasi.setScene(sceneAplikasi);
            stageAplikasi.show();
        } catch (IOException ex) {
            Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    private void initViewBukuAlamat() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(BukuAlamat.class.getResource("view/ViewBukuAlamat.fxml"));
            AnchorPane guiIsi = (AnchorPane)loader.load();
            rootAplikasi.setCenter(guiIsi);
            
            ViewBukuAlamatController kontroler = loader.getController();
            kontroler.setKelasUtama(this);
            
        } catch (IOException ex) {
            Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}