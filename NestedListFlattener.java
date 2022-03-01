public class NestedListFlattener {
    private List<Object> returnList = new LinkedList<>();

    public NestedListFlattener(Object o) {
        handle(o);
    }

    private void handle(Object o) {
        if (o instanceof List) {
            handleList((List) o);
		} else {
            returnList.add(o);
        }
    }

    public Collection<Object> getFlattenedList() {
        return new LinkedList<>(returnList);
    }
}
