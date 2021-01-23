package bukualamat.view;

import bukualamat.BukuAlamat;
import bukualamat.model.DataPersonal;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBukuAlamatController {

    @FXML
    private TableView<DataPersonal> tablePerson;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaDepan;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaBelakang;

    @FXML
    private Label labelNamaDepan;

    @FXML
    private Label labelNamaBelakang;

    @FXML
    private Label labelAlamat;

    @FXML
    private Label labelKota;

    @FXML
    private Label labelNoHP;
    
    private BukuAlamat kelasUtama;
    
    public ViewBukuAlamatController(){
    }
    
    @FXML
    private void initialize(){
        kolomNamaDepan.setCellValueFactory(celldata->celldata.getValue().NamaDepanProperty());
        kolomNamaBelakang.setCellValueFactory(celldata->celldata.getValue().NamaBelakangProperty());
    }
    public void setKelasUtama(BukuAlamat bukualamat){
        this.kelasUtama = bukualamat;
        
        tablePerson.setItems(kelasUtama.getDataPersonal());
    }

}
