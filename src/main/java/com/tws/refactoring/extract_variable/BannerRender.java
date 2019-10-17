package com.tws.refactoring.extract_variable;

public class BannerRender {

    private static final String MAC = "MAC";
    private static final String IE = "IE";
    private static final String BANNER = "banner";

    public String renderBanner(String platform, String browser) {
        boolean isPlatformMAC = platform.toUpperCase().contains(MAC);
        boolean isBrowserIE = browser.toUpperCase().contains(IE);
        if (isPlatformMAC && isBrowserIE) {
            return "IE on Mac?";
        }
        return BANNER;
    }
}
