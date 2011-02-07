package ilarkesto.pdf;

public abstract class APdfBuilder extends APdfContainerElement {

	protected FontStyle defaultFontStyle;
	protected float marginTop = 15f;
	protected float marginBottom = 20f;
	protected float marginLeft = 20f;
	protected float marginRight = 20f;

	public APdfBuilder() {
		super(null);
	}

	enum Alignment {
		LEFT, RIGHT, CENTER, JUSTIFIED
	}

	public abstract APdfBuilder newPage();

	public abstract boolean isNewPage();

	public APdfBuilder setDefaultFontStyle(FontStyle defaultFontStyle) {
		this.defaultFontStyle = defaultFontStyle;
		return this;
	}

	public FontStyle getDefaultFontStyle() {
		return defaultFontStyle;
	}

	public APdfBuilder setMarginTop(float marginTop) {
		this.marginTop = marginTop;
		return this;
	}

	public APdfBuilder setMarginBottom(float marginBottom) {
		this.marginBottom = marginBottom;
		return this;
	}

	public APdfBuilder setMarginLeft(float marginLeft) {
		this.marginLeft = marginLeft;
		return this;
	}

	public APdfBuilder setMarginRight(float marginRight) {
		this.marginRight = marginRight;
		return this;
	}

	// --- helper ---

	protected static final int dpi = 72;

	public static float mmToPoints(Float mm) {
		if (mm == null) return 0;
		return (mm / 25.4f) * dpi;
	}

	public static float mmToPoints(Double mm) {
		if (mm == null) return 0;
		return (float) ((mm / 25.4f) * dpi);
	}

}
