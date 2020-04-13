public class Edge {
    private Coordinate start;
    private Coordinate end;

    public Edge(Coordinate start, Coordinate end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Pythagorean Theorem
     * @return
     */
    public double getLength() {
        float run = end.getX() - start.getX();
        float rise = end.getY() - start.getY();
        return Math.abs(Math.sqrt((run*run) + (rise*rise)));
    }
}
