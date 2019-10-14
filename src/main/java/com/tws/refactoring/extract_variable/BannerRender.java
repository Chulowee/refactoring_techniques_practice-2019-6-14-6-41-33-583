package com.tws.refactoring.extract_variable;

public class BannerRender {

    public static final String MAC = "MAC";
    public static final String IE = "IE";
    public static final String BANNER = "banner";

    String renderBanner(String platform, String browser) {
        if ((platform.toUpperCase().contains(MAC)) &&
                (browser.toUpperCase().contains(IE))) {
            return "IE on Mac?";
        }
        return BANNER;
    }
}
