package io.springbox.integration;

public class ProducerResponse {
    private int value;

    public ProducerResponse() {
		super();
	}

	public ProducerResponse(int value) {
		super();
		this.value = value;
	}

	public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
