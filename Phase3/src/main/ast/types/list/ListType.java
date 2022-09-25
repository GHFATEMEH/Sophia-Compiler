package main.ast.types.list;

import main.ast.types.Type;

import java.util.ArrayList;

public class ListType extends Type {
    private ArrayList<ListNameType> elementsTypes = new ArrayList<>();

    public ListType() {
    }

    public ListType(ArrayList<ListNameType> elementsTypes) {
        this.elementsTypes = elementsTypes;
    }

    public ListType(int listSize, ListNameType listNameType) {
        for(int i=0; i < listSize; i++) {
            elementsTypes.add(listNameType);
        }
    }

    public ArrayList<ListNameType> getElementsTypes() {
        return elementsTypes;
    }

    public void setElementsTypes(ArrayList<ListNameType> elementsTypes) {
        this.elementsTypes = elementsTypes;
    }

    public void addElementType(ListNameType listNameType) {
        this.elementsTypes.add(listNameType);
    }

    public ArrayList<Type> getTypeList() {
        ArrayList<Type> result = new ArrayList<>();
        for (ListNameType l : elementsTypes) {
            result.add(l.getType());
        }
        return result;
    }

    public boolean checkIfListHasTwoSameId() {
        for (int i = 0; i < elementsTypes.size(); i++) {
            for (int j = i + 1; j < elementsTypes.size(); j++) {
                if (!elementsTypes.get(i).getName().getName().equals("") && !elementsTypes.get(j).getName().getName().equals("")) {
                    if (elementsTypes.get(i).getName().getName().equals(elementsTypes.get(j).getName().getName())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "ListType";
    }
}
