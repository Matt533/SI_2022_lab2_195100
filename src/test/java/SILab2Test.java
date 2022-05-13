import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test
{
    private List<String> ListaCreate(String...elements)
    {
     return new ArrayList<>(Arrays.asList(elements));
    }
    @Test
    void EveryTest()
    {
       IllegalArgumentException isklucok;

       //Prv Test, koga goleminata na listata e 0
       isklucok = assertThrows(IllegalArgumentException.class,()->SILab2.function(ListaCreate()));
       assertTrue(isklucok.getMessage().contains("List length should be greater than 0"));

       //Vtor Test, koga goleminata na listata e 2
        isklucok = assertThrows(IllegalArgumentException.class,()->SILab2.function(ListaCreate("@#","#","matej")));
        assertTrue(isklucok.getMessage().contains("List length should be a perfect square"));

        //Tret Test, koga goleminata na listata e 16
        List<String> lista1 = ListaCreate("@#","#","#","#","#@","#","#","#","#","#@","#","#","#","#@","@","@");
        List<String> rezultat = ListaCreate("1", "#", "#", "#", "2", "#", "#", "#", "#", "3", "#", "#", "#", "1", "1", "1");
        assertEquals(rezultat,SILab2.function(lista1));

    }
}
