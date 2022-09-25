package main.ast.nodes;

import main.compileErrorException.CompileErrorException;
import main.visitor.IVisitor;

import java.util.ArrayList;

public abstract class Node {
    private int line;
    public int voidErrIndex;
    private ArrayList<CompileErrorException> errors = new ArrayList<>();
    public static boolean isCatchErrorsActive = true;

    public ArrayList<CompileErrorException> flushErrors() {
        ArrayList<CompileErrorException> errors = this.errors;
        this.errors = new ArrayList<>();
        return errors;
    }

    public void addError(CompileErrorException e) {
        if(Node.isCatchErrorsActive) {
            this.errors.add(e);
        }
    }

    public boolean hasError() {
        return this.errors.size() != 0;
    }

//    public void removeVoidError() {
//        for (CompileErrorException e : errors) {
//            if (e instanceof CantUseValueOfVoidMethod) {
//                errors.remove(e);
//            }
//        }
//    }

    public void removeVoidError() {
        errors.remove(voidErrIndex);
    }

    public ArrayList<CompileErrorException> getErrors() {
        return errors;
    }

    public int getErrorListSize() {
        return errors.size();
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public abstract String toString();

    public abstract <T> T accept(IVisitor<T> visitor);
}

