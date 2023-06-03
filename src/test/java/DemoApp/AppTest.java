package DemoApp;

import org.example.Main;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testCodeFrancja(){
        String textToCode="FRANCJA";
        String codedText="ANFCRJA";
        assert(Main.Code(textToCode).equals(codedText));

    }
    @Test
    void testCodeDobrydzien(){
        String textToCode="DOBRYDZIEN";
        String codedText="BRDYOIEDNZ";
        assert(Main.Code(textToCode).equals(codedText));

    }
    @Test
    void testCodePolitechnika(){
        String textToCode="POLITECHNIKA";
        String codedText="LIPTOHNEICKA";
        assert(Main.Code(textToCode).equals(codedText));

    }
    @Test
    void testCodeUniversity(){
        String textToCode="UNIVERSITY";
        String codedText="IVUENITRYS";
        assert(Main.Code(textToCode).equals(codedText));

    }

    @Test
    void testDecodeFrancja(){
        String decodedText="FRANCJA";
        String codedText="ANFCRJA";
        assert(Main.Decode(codedText).equals(decodedText));

    }

    @Test
    void testDecodeDobrydzien(){
        String decodedText="DOBRYDZIEN";
        String codedText="BRDYOIEDNZ";
        assert(Main.Decode(codedText).equals(decodedText));

    }

    @Test
    void testDecodePolitechnika(){
        String decodedText="POLITECHNIKA";
        String codedText="LIPTOHNEICKA";
        assert(Main.Decode(codedText).equals(decodedText));

    }

    @Test
    void testDecodeUniversity(){
        String decodedText="UNIVERSITY";
        String codedText="IVUENITRYS";
        assert(Main.Decode(codedText).equals(decodedText));

    }


}