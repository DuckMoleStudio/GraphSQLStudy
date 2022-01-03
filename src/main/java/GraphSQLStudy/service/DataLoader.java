package GraphSQLStudy.service;

import GraphSQLStudy.entity.Route;
import GraphSQLStudy.repository.RouteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

@Component
public class DataLoader implements ApplicationRunner {


    private RouteRepository userRepositoryR;

    @Autowired
    public DataLoader(RouteRepository userRepositoryR) {
        this.userRepositoryR = userRepositoryR;
    }

    public void run(ApplicationArguments args) {
/*
        int count=0;
        InputStream is = getClass().getClassLoader().getResourceAsStream("moscow_bus_routes.xls");
        try(
                //FileInputStream fis = new FileInputStream("./resources/moscow_bus_routes.xls");
                HSSFWorkbook workbook = new HSSFWorkbook(is)) {
            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);

            // Get iterator to all the rows in current sheet
            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next(); // skip first row with headers
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // Create entity
                final Route route = new Route();

                // Get significant fields

                route.setId(Integer.parseInt(row.getCell(2).getStringCellValue()));
                route.setShortName(row.getCell(4).getStringCellValue());
                route.setLongName(row.getCell(5).getStringCellValue());
                route.setRegNum(row.getCell(3).getStringCellValue());
                route.setRouteType(row.getCell(6).getStringCellValue());

                userRepositoryR.save(route);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


 */
        System.out.printf("\n\n===== Loaded %d routes ======\n\n", 123);

    }
}