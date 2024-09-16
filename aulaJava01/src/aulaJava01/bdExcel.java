package aulaJava01;

import org.apache.*;
import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileInputStream;
import java.lang.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


public class bdExcel {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		//RECEBENDO O ARQUIVO COMO VARIÁVEL.
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("D:\\pasta\\Treino\\programação\\Resources\\Book.xlsx"));
		
		//LER A PLANILHA DO ARQUIVO.
		XSSFSheet sh = wb.getSheet("Planilha1");
		
		/* LER CÉLULA ESPECÍFICA DA PLANILHA.
		 * String cel = sh.getRow().getCell().toString();
		 */
		
		/*OBTER INDEX DA LINHA E DA COLUNA.
		 * int numLin = sh.getLastRowNum(); GETLASTROWNUM VAI RETORNAR O INDEX DA LINHA
		 * int numCol = sh.getRowNum(0).getLastCellNum(); GETLASTCELLNUM VAI RETORNAR O NÚMERO DE COLUNAS.
		 */
		
		boolean f = true;
		
		while (f) {
			
			System.out.println("Digite 1 para criar arquivo."
					+ "\nDigite 2 para visualizar arquivo ou partes dele."
					+ "\nDigite 3 para modificar o arquivo."
					+ "\nDigite 4 para deletar arquivo."
					+ "\nDigite qualquer outra coisa para finalizar a execução.");
			
			int x;
			
			try {
				x = scn.nextInt();
			} catch (Exception e) {
				System.out.println("finalizando execução.");
				break;
			}
			
			switch (x) {
			case 1 : {
				System.out.println("a");
				break;
			}
			
			case 2 : {
				String cel = sh.getRow(1).getCell(1).toString();
				int numLin = sh.getLastRowNum();
				int numCol = sh.getRow(0).getLastCellNum();
				System.out.println(cel);
				System.out.println(numLin);
				System.out.println(numCol);
				for (int i = 0;i <= numLin;i++) {
					for (int j = 0;j < numCol; j++) {
						String cell = sh.getRow(i).getCell(j).toString();
						if (j == 0) {
							System.out.print(i);
						}
						System.out.print(" " + cell + "  ");
						if (j == 1) {
							System.out.println("");
						}
					}
				}
				break;
			}
			case 3 : {
				System.out.println("c");
				break;
			}
			case 4 : {
				System.out.println("d");
				break;
			}
			default:
				
				System.out.println("Finalizando execução.");
				f = false;
				
			}
		}
	}
}
