package generators;


import components.SymbolTable;
import interfaces.IListing;
import components.Options;
import interfaces.IIR;
import interfaces.ISymbolTable;


/**
 * generates the executable file and listing file
 * (currently only the listing file)
 */
public class CodeGenerator {
    private IListing list;


    /**
     * Parametrized Constructor that creates the listing file
     *
     * @param
     */
    public CodeGenerator(IIR ir, ISymbolTable symbolTable, Options op) {
        System.out.println("listing en: " + op.listingEnabled());
        if (op.listingEnabled())
            new Listing(ir).openOutputStream();
        System.out.println("Verbose en: " + op.verboseEnabled());
        if (op.verboseEnabled())
            symbolTable.verboseLabelsTable();


    }

    //code generation here


		/*this.list = list;
		this.list.openOutputStream();*/
}
//not sure why this method cannot be resolved







