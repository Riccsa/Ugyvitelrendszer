
package Utils;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Print implements Printable, Pageable {

    private Component component;
    private int pageNum;
    private PageFormat pageFormat;
    private Dimension page;

    public Print(Component component) {

        this.component = component;
        page = component.getPreferredSize();
        pageFormat = new PageFormat();
        pageNum = (int) Math.ceil(page.height / 842.0);

    }

    public void print() {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        printJob.setPrintable(this);
        printJob.setPageable(this);
        pageFormat = printJob.defaultPage();

        if (printJob.printDialog()) {
            try {
                printJob.print();
            } catch (PrinterException pe) {
                System.out.println("Error printing: " + pe);
            }
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        Graphics2D gf = (Graphics2D) graphics;
        gf.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        gf.scale(0.5,  0.5);
        component.paint(gf);    
        return Printable.PAGE_EXISTS;

    }

    @Override
    public int getNumberOfPages() {
        return pageNum;
    }

    @Override
    public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
        return pageFormat;
    }

    @Override
    public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
        return this;
    }
    
    

}
