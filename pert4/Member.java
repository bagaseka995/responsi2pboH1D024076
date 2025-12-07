class Member extends Customer {
    private int poinReward;
    private String level;

    public Member(String nama, String id, int totalBelanja, int poinReward, String level) {
        super(nama, id, totalBelanja);
        this.poinReward = poinReward;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + level);
    }
}