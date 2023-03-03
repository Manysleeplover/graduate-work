package ru.romanov.tests.views.test;


import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import ru.romanov.tests.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Загрузка ФГОС")
@Route(value = "/", layout = MainLayout.class)
public class FGOSUploadView extends VerticalLayout {

    private MemoryBuffer memoryBuffer;
    private Upload upload =  new Upload();
    private TextField uploadField = new TextField();

    public FGOSUploadView() {
        add(configureFGOSUploadFields());
    }


    private VerticalLayout configureFGOSUploadFields(){
        uploadField.setLabel("Ссылка для скачивания");
        Div uploadTextFiledDiv = new Div();
        uploadTextFiledDiv.add(uploadField);

        Div uploadDiv = new Div();
        uploadDiv.add(upload);

        VerticalLayout mainUploadDiv = new VerticalLayout();
        mainUploadDiv.add(uploadTextFiledDiv,uploadDiv);
        mainUploadDiv.setAlignItems(Alignment.CENTER);

        return mainUploadDiv;
    }
}
