public class NestedIterator implements Iterator<Integer> {

    private List<Integer> nestedList = new ArrayList<>();
    private int index;

    private static void buildList(List<Integer> list, List<NestedInteger> nestedList)
    {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) list.add(nestedInteger.getInteger());
            else buildList(list, nestedInteger.getList());
        }
    }

    public NestedIterator(List<NestedInteger> nestedList) {
        buildList(this.nestedList, nestedList);
    }

    @Override
    public Integer next() {
        return nestedList.get(index++);
    }

    @Override
    public boolean hasNext() {
        return nestedList.size() != index;
    }
}
