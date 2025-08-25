package soccer.play;

public class DisplayString implements IDisplayDataItem {
    private String displayDetail;
    private int id;
    private String detailType;

    public DisplayString(String displayDetail, int id, String detailType) {
        this.displayDetail = displayDetail;
        this.id = id;
        this.detailType = detailType;
    }

    @Override
    public boolean isDetailAvailable() {
        return displayDetail != null && !displayDetail.isEmpty();
    }

    @Override
    public String getDisplayDetail() {
        return displayDetail;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getDetailType() {
        return detailType;
    }

    @Override
    public String toString() {
        return displayDetail;
    }
}
