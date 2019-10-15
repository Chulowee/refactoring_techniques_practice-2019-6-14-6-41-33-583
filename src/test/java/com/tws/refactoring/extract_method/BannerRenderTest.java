package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BannerRenderTest {
    @Test
    public void should_return_IE_on_Mac_when_platform_MAC_and_browser_IE() {
        BannerRender bannerRender = new BannerRender();

        String banner = bannerRender.renderBanner("MAC", "IE");

        assertEquals("IE on Mac?", banner);
    }

    @Test
    public void should_return_banner_when_platform_Windows_and_browser_IE() {
        BannerRender bannerRender = new BannerRender();

        String banner = bannerRender.renderBanner("Windows", "IE");

        assertEquals("banner", banner);
    }


    @Test
    public void should_return_banner_when_platform_MAC_and_browser_FireFox() {
        BannerRender bannerRender = new BannerRender();

        String banner = bannerRender.renderBanner("MAC", "FireFox");

        assertEquals("banner", banner);
    }



    @Test
    public void should_return_banner_when_platform_Windows_and_browser_FireFox() {
        BannerRender bannerRender = new BannerRender();

        String banner = bannerRender.renderBanner("Windows", "FireFox");

        assertEquals("banner", banner);
    }
}
