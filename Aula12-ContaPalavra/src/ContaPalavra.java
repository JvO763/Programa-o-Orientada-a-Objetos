import java.util.StringTokenizer;
import java.util.Map;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class ContaPalavra {
	   private Map< String, Integer > map;
	   private Scanner scanner;
	   private File inFile;

	   public ContaPalavra(String f) throws FileNotFoundException
	   {
	      map = new HashMap< String, Integer >();// cria HashMap
	      inFile = new File(f);
	      scanner = new Scanner( inFile ); // cria scanner
	      scanner.useDelimiter("\\W");
	   } 
	   
	   // cria mapa de entrada de usuário
	   public void criaMapa() 
	   {
	      // processamento texto de entrada 
	      while ( scanner.hasNext() ) // enquanto houver mais entrada
	      {
	         String word = scanner.next().toLowerCase(); // obtém palavra
	                  
	         // se o mapa contiver a palavra
	         if (map.containsKey( word )) // palavra está no mapa
	         {
	            int count = map.get( word ); // obtém contagem atual 
	            map.put( word, count + 1 );// incrementa a contagem de 
	         } // fim do if
	         else 
	            map.put( word, 1 );// adiciona nova palavra com uma contagem de 1 ao mapa
	       } 
	   }  
	   
	   // exibe conteúdo do mapa 
	   public void mostraMapa() 
	   {      
	      Set< String > keys = map.keySet();// obtém as chaves

	      // classifica as chaves 
	      TreeSet< String > sortedKeys = new TreeSet< String >( keys );

	      System.out.println( "Mapa contém:\nChave\t\tValor" );

	      // gera saída de cada chave no mapa
	      for ( String key : sortedKeys )
	         System.out.printf( "%-20s%10d\n", key, map.get( key ));
	      
	   } 

	   public static void main( String args[] ) throws IOException, ClassNotFoundException
	   {
	      ContaPalavra cp = new ContaPalavra("src/ContaPalavra.java");
	      cp.criaMapa();
	      cp.mostraMapa();
	   } 
}
