package imallett.FlashBang.Measurement;

import imallett.FlashBang.DataStream;

public abstract class MeasurerBase {
	public boolean valid;

	public final DataStream stream;

	protected MeasurerBase(DataStream stream) {
		this.stream = stream;
	}
}
