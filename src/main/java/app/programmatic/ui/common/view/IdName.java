package app.programmatic.ui.common.view;

public class IdName {
    private Long id;
    private String name;

    public IdName(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public IdName() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
