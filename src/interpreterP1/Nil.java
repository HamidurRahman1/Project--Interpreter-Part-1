
package interpreterP1;

import java.util.HashMap;

class Nil extends Exp
{
    void printParseTree(String indent)
    {
        super.printParseTree(indent);
        String indent1 = indent+" ";
        IO.displayln(indent1 + indent1.length() + " nil");
    }

    @Override
    Val Eval(HashMap<String, Val> state) {
        return new NilVal();
    }
}