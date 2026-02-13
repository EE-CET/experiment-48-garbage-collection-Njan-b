class GarbageCollection {

    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();
        
        // Making object eligible for garbage collection
        obj = null;

        // Requesting JVM to run Garbage Collector
        System.gc();
    }
}
