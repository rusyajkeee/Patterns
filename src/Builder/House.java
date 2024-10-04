package Builder;

public class House {
    private int rooms;
    private int floors;
    private int pools;
    private int garages;



    private House(Builder builder) {
        this.rooms = builder.rooms;
        this.floors = builder.floors;
        this.pools = builder.pools;
        this.garages = builder.garages;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", floors=" + floors +
                ", pools=" + pools +
                ", garages=" + garages +
                '}';
    }

    public static class Builder {
        private int rooms;
        private int floors;
        private int pools;
        private int garages;

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        };
        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        };
        public Builder pools(int pools) {
            this.pools = pools;
            return this;
        };

        private Builder garages(int garages) {
            this.garages = garages;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }

    public static void main(String[] args) {
        House home = House.builder().rooms(3).floors(2).pools(1).build();
        System.out.println(home.toString());
    }

}
