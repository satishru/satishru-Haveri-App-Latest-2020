package application.haveri.tourism;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import application.haveri.tourism.databinding.AboutBottomSheetBindingImpl;
import application.haveri.tourism.databinding.ActivityAboutBindingImpl;
import application.haveri.tourism.databinding.ActivityEventDetailBindingImpl;
import application.haveri.tourism.databinding.ActivityHomeBindingImpl;
import application.haveri.tourism.databinding.ActivityImageViewBindingImpl;
import application.haveri.tourism.databinding.ActivityMapSingleBindingImpl;
import application.haveri.tourism.databinding.ActivityPlaceBindingImpl;
import application.haveri.tourism.databinding.ActivitySettingBindingImpl;
import application.haveri.tourism.databinding.ActivitySplashBindingImpl;
import application.haveri.tourism.databinding.ActivityTalukBindingImpl;
import application.haveri.tourism.databinding.ActivityVideosExploreBindingImpl;
import application.haveri.tourism.databinding.ContentHomeBindingImpl;
import application.haveri.tourism.databinding.FragmentExploreVideoBindingImpl;
import application.haveri.tourism.databinding.FragmentHomeBindingImpl;
import application.haveri.tourism.databinding.FragmentHomeContentBindingImpl;
import application.haveri.tourism.databinding.FragmentPlaceAboutBindingImpl;
import application.haveri.tourism.databinding.FragmentPlaceDetailBindingImpl;
import application.haveri.tourism.databinding.FragmentPlaceEventBindingImpl;
import application.haveri.tourism.databinding.FragmentPlaceImageGalleryBindingImpl;
import application.haveri.tourism.databinding.FragmentPlaceListBindingImpl;
import application.haveri.tourism.databinding.FragmentPlaceVideosBindingImpl;
import application.haveri.tourism.databinding.FragmentPlayVideoBindingImpl;
import application.haveri.tourism.databinding.FragmentPlayVideoBindingLandImpl;
import application.haveri.tourism.databinding.FragmentTalukAboutBindingImpl;
import application.haveri.tourism.databinding.FragmentTalukDetailBindingImpl;
import application.haveri.tourism.databinding.FragmentTalukEventBindingImpl;
import application.haveri.tourism.databinding.FragmentTalukImageGalleryBindingImpl;
import application.haveri.tourism.databinding.FragmentTalukListBindingImpl;
import application.haveri.tourism.databinding.FragmentTalukPlacesBindingImpl;
import application.haveri.tourism.databinding.FragmentTalukVideosBindingImpl;
import application.haveri.tourism.databinding.LayoutErrorBindingImpl;
import application.haveri.tourism.databinding.LayoutEventItemBindingImpl;
import application.haveri.tourism.databinding.LayoutFullscreenImageBindingImpl;
import application.haveri.tourism.databinding.LayoutHomeEventItemBindingImpl;
import application.haveri.tourism.databinding.LayoutHomeImageGalleryItemBindingImpl;
import application.haveri.tourism.databinding.LayoutHomePlaceItemBindingImpl;
import application.haveri.tourism.databinding.LayoutHomeTalukItemBindingImpl;
import application.haveri.tourism.databinding.LayoutImageGalleryItemBindingImpl;
import application.haveri.tourism.databinding.LayoutImageSliderItemBindingImpl;
import application.haveri.tourism.databinding.LayoutMapBindingImpl;
import application.haveri.tourism.databinding.LayoutPlaceItemBindingImpl;
import application.haveri.tourism.databinding.LayoutTalukItemBindingImpl;
import application.haveri.tourism.databinding.LayoutThemeListItemBindingImpl;
import application.haveri.tourism.databinding.LayoutToolbarBindingImpl;
import application.haveri.tourism.databinding.LayoutToolbarHomeBindingImpl;
import application.haveri.tourism.databinding.LayoutVideoListItemBindingImpl;
import application.haveri.tourism.databinding.TestBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ABOUTBOTTOMSHEET = 1;

  private static final int LAYOUT_ACTIVITYABOUT = 2;

  private static final int LAYOUT_ACTIVITYEVENTDETAIL = 3;

  private static final int LAYOUT_ACTIVITYHOME = 4;

  private static final int LAYOUT_ACTIVITYIMAGEVIEW = 5;

  private static final int LAYOUT_ACTIVITYMAPSINGLE = 6;

  private static final int LAYOUT_ACTIVITYPLACE = 7;

  private static final int LAYOUT_ACTIVITYSETTING = 8;

  private static final int LAYOUT_ACTIVITYSPLASH = 9;

  private static final int LAYOUT_ACTIVITYTALUK = 10;

  private static final int LAYOUT_ACTIVITYVIDEOSEXPLORE = 11;

  private static final int LAYOUT_CONTENTHOME = 12;

  private static final int LAYOUT_FRAGMENTEXPLOREVIDEO = 13;

  private static final int LAYOUT_FRAGMENTHOME = 14;

  private static final int LAYOUT_FRAGMENTHOMECONTENT = 15;

  private static final int LAYOUT_FRAGMENTPLACEABOUT = 16;

  private static final int LAYOUT_FRAGMENTPLACEDETAIL = 17;

  private static final int LAYOUT_FRAGMENTPLACEEVENT = 18;

  private static final int LAYOUT_FRAGMENTPLACEIMAGEGALLERY = 19;

  private static final int LAYOUT_FRAGMENTPLACELIST = 20;

  private static final int LAYOUT_FRAGMENTPLACEVIDEOS = 21;

  private static final int LAYOUT_FRAGMENTPLAYVIDEO = 22;

  private static final int LAYOUT_FRAGMENTTALUKABOUT = 23;

  private static final int LAYOUT_FRAGMENTTALUKDETAIL = 24;

  private static final int LAYOUT_FRAGMENTTALUKEVENT = 25;

  private static final int LAYOUT_FRAGMENTTALUKIMAGEGALLERY = 26;

  private static final int LAYOUT_FRAGMENTTALUKLIST = 27;

  private static final int LAYOUT_FRAGMENTTALUKPLACES = 28;

  private static final int LAYOUT_FRAGMENTTALUKVIDEOS = 29;

  private static final int LAYOUT_LAYOUTERROR = 30;

  private static final int LAYOUT_LAYOUTEVENTITEM = 31;

  private static final int LAYOUT_LAYOUTFULLSCREENIMAGE = 32;

  private static final int LAYOUT_LAYOUTHOMEEVENTITEM = 33;

  private static final int LAYOUT_LAYOUTHOMEIMAGEGALLERYITEM = 34;

  private static final int LAYOUT_LAYOUTHOMEPLACEITEM = 35;

  private static final int LAYOUT_LAYOUTHOMETALUKITEM = 36;

  private static final int LAYOUT_LAYOUTIMAGEGALLERYITEM = 37;

  private static final int LAYOUT_LAYOUTIMAGESLIDERITEM = 38;

  private static final int LAYOUT_LAYOUTMAP = 39;

  private static final int LAYOUT_LAYOUTPLACEITEM = 40;

  private static final int LAYOUT_LAYOUTTALUKITEM = 41;

  private static final int LAYOUT_LAYOUTTHEMELISTITEM = 42;

  private static final int LAYOUT_LAYOUTTOOLBAR = 43;

  private static final int LAYOUT_LAYOUTTOOLBARHOME = 44;

  private static final int LAYOUT_LAYOUTVIDEOLISTITEM = 45;

  private static final int LAYOUT_TEST = 46;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(46);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.about_bottom_sheet, LAYOUT_ABOUTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_about, LAYOUT_ACTIVITYABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_event_detail, LAYOUT_ACTIVITYEVENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_image_view, LAYOUT_ACTIVITYIMAGEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_map_single, LAYOUT_ACTIVITYMAPSINGLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_place, LAYOUT_ACTIVITYPLACE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_setting, LAYOUT_ACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_taluk, LAYOUT_ACTIVITYTALUK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.activity_videos_explore, LAYOUT_ACTIVITYVIDEOSEXPLORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.content_home, LAYOUT_CONTENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_explore_video, LAYOUT_FRAGMENTEXPLOREVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_home_content, LAYOUT_FRAGMENTHOMECONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_place_about, LAYOUT_FRAGMENTPLACEABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_place_detail, LAYOUT_FRAGMENTPLACEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_place_event, LAYOUT_FRAGMENTPLACEEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_place_image_gallery, LAYOUT_FRAGMENTPLACEIMAGEGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_place_list, LAYOUT_FRAGMENTPLACELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_place_videos, LAYOUT_FRAGMENTPLACEVIDEOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_play_video, LAYOUT_FRAGMENTPLAYVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_taluk_about, LAYOUT_FRAGMENTTALUKABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_taluk_detail, LAYOUT_FRAGMENTTALUKDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_taluk_event, LAYOUT_FRAGMENTTALUKEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_taluk_image_gallery, LAYOUT_FRAGMENTTALUKIMAGEGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_taluk_list, LAYOUT_FRAGMENTTALUKLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_taluk_places, LAYOUT_FRAGMENTTALUKPLACES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.fragment_taluk_videos, LAYOUT_FRAGMENTTALUKVIDEOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_error, LAYOUT_LAYOUTERROR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_event_item, LAYOUT_LAYOUTEVENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_fullscreen_image, LAYOUT_LAYOUTFULLSCREENIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_home_event_item, LAYOUT_LAYOUTHOMEEVENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_home_image_gallery_item, LAYOUT_LAYOUTHOMEIMAGEGALLERYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_home_place_item, LAYOUT_LAYOUTHOMEPLACEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_home_taluk_item, LAYOUT_LAYOUTHOMETALUKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_image_gallery_item, LAYOUT_LAYOUTIMAGEGALLERYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_image_slider_item, LAYOUT_LAYOUTIMAGESLIDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_map, LAYOUT_LAYOUTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_place_item, LAYOUT_LAYOUTPLACEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_taluk_item, LAYOUT_LAYOUTTALUKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_theme_list_item, LAYOUT_LAYOUTTHEMELISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_toolbar, LAYOUT_LAYOUTTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_toolbar_home, LAYOUT_LAYOUTTOOLBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.layout_video_list_item, LAYOUT_LAYOUTVIDEOLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(application.haveri.tourism.R.layout.test, LAYOUT_TEST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ABOUTBOTTOMSHEET: {
          if ("layout/about_bottom_sheet_0".equals(tag)) {
            return new AboutBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for about_bottom_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYABOUT: {
          if ("layout/activity_about_0".equals(tag)) {
            return new ActivityAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_about is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEVENTDETAIL: {
          if ("layout/activity_event_detail_0".equals(tag)) {
            return new ActivityEventDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_event_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYIMAGEVIEW: {
          if ("layout/activity_image_view_0".equals(tag)) {
            return new ActivityImageViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_image_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAPSINGLE: {
          if ("layout/activity_map_single_0".equals(tag)) {
            return new ActivityMapSingleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_map_single is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPLACE: {
          if ("layout/activity_place_0".equals(tag)) {
            return new ActivityPlaceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_place is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTING: {
          if ("layout/activity_setting_0".equals(tag)) {
            return new ActivitySettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTALUK: {
          if ("layout/activity_taluk_0".equals(tag)) {
            return new ActivityTalukBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_taluk is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVIDEOSEXPLORE: {
          if ("layout/activity_videos_explore_0".equals(tag)) {
            return new ActivityVideosExploreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_videos_explore is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTHOME: {
          if ("layout/content_home_0".equals(tag)) {
            return new ContentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXPLOREVIDEO: {
          if ("layout/fragment_explore_video_0".equals(tag)) {
            return new FragmentExploreVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_explore_video is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOMECONTENT: {
          if ("layout/fragment_home_content_0".equals(tag)) {
            return new FragmentHomeContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home_content is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACEABOUT: {
          if ("layout/fragment_place_about_0".equals(tag)) {
            return new FragmentPlaceAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACEDETAIL: {
          if ("layout/fragment_place_detail_0".equals(tag)) {
            return new FragmentPlaceDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACEEVENT: {
          if ("layout/fragment_place_event_0".equals(tag)) {
            return new FragmentPlaceEventBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_event is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACEIMAGEGALLERY: {
          if ("layout/fragment_place_image_gallery_0".equals(tag)) {
            return new FragmentPlaceImageGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_image_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACELIST: {
          if ("layout/fragment_place_list_0".equals(tag)) {
            return new FragmentPlaceListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACEVIDEOS: {
          if ("layout/fragment_place_videos_0".equals(tag)) {
            return new FragmentPlaceVideosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_videos is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYVIDEO: {
          if ("layout-land/fragment_play_video_0".equals(tag)) {
            return new FragmentPlayVideoBindingLandImpl(component, view);
          }
          if ("layout/fragment_play_video_0".equals(tag)) {
            return new FragmentPlayVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_play_video is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTALUKABOUT: {
          if ("layout/fragment_taluk_about_0".equals(tag)) {
            return new FragmentTalukAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_taluk_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTALUKDETAIL: {
          if ("layout/fragment_taluk_detail_0".equals(tag)) {
            return new FragmentTalukDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_taluk_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTALUKEVENT: {
          if ("layout/fragment_taluk_event_0".equals(tag)) {
            return new FragmentTalukEventBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_taluk_event is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTALUKIMAGEGALLERY: {
          if ("layout/fragment_taluk_image_gallery_0".equals(tag)) {
            return new FragmentTalukImageGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_taluk_image_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTALUKLIST: {
          if ("layout/fragment_taluk_list_0".equals(tag)) {
            return new FragmentTalukListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_taluk_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTALUKPLACES: {
          if ("layout/fragment_taluk_places_0".equals(tag)) {
            return new FragmentTalukPlacesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_taluk_places is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTALUKVIDEOS: {
          if ("layout/fragment_taluk_videos_0".equals(tag)) {
            return new FragmentTalukVideosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_taluk_videos is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTERROR: {
          if ("layout/layout_error_0".equals(tag)) {
            return new LayoutErrorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_error is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTEVENTITEM: {
          if ("layout/layout_event_item_0".equals(tag)) {
            return new LayoutEventItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_event_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTFULLSCREENIMAGE: {
          if ("layout/layout_fullscreen_image_0".equals(tag)) {
            return new LayoutFullscreenImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_fullscreen_image is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTHOMEEVENTITEM: {
          if ("layout/layout_home_event_item_0".equals(tag)) {
            return new LayoutHomeEventItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_home_event_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTHOMEIMAGEGALLERYITEM: {
          if ("layout/layout_home_image_gallery_item_0".equals(tag)) {
            return new LayoutHomeImageGalleryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_home_image_gallery_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTHOMEPLACEITEM: {
          if ("layout/layout_home_place_item_0".equals(tag)) {
            return new LayoutHomePlaceItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_home_place_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTHOMETALUKITEM: {
          if ("layout/layout_home_taluk_item_0".equals(tag)) {
            return new LayoutHomeTalukItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_home_taluk_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTIMAGEGALLERYITEM: {
          if ("layout/layout_image_gallery_item_0".equals(tag)) {
            return new LayoutImageGalleryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_image_gallery_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTIMAGESLIDERITEM: {
          if ("layout/layout_image_slider_item_0".equals(tag)) {
            return new LayoutImageSliderItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_image_slider_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTMAP: {
          if ("layout/layout_map_0".equals(tag)) {
            return new LayoutMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_map is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPLACEITEM: {
          if ("layout/layout_place_item_0".equals(tag)) {
            return new LayoutPlaceItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_place_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTALUKITEM: {
          if ("layout/layout_taluk_item_0".equals(tag)) {
            return new LayoutTalukItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_taluk_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTHEMELISTITEM: {
          if ("layout/layout_theme_list_item_0".equals(tag)) {
            return new LayoutThemeListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_theme_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTOOLBAR: {
          if ("layout/layout_toolbar_0".equals(tag)) {
            return new LayoutToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTOOLBARHOME: {
          if ("layout/layout_toolbar_home_0".equals(tag)) {
            return new LayoutToolbarHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_toolbar_home is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTVIDEOLISTITEM: {
          if ("layout/layout_video_list_item_0".equals(tag)) {
            return new LayoutVideoListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_video_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TEST: {
          if ("layout/test_0".equals(tag)) {
            return new TestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for test is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "talukObj");
      sKeys.put(2, "selectedLanguage");
      sKeys.put(3, "viewModel");
      sKeys.put(4, "placeObj");
      sKeys.put(5, "imageObj");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(47);

    static {
      sKeys.put("layout/about_bottom_sheet_0", application.haveri.tourism.R.layout.about_bottom_sheet);
      sKeys.put("layout/activity_about_0", application.haveri.tourism.R.layout.activity_about);
      sKeys.put("layout/activity_event_detail_0", application.haveri.tourism.R.layout.activity_event_detail);
      sKeys.put("layout/activity_home_0", application.haveri.tourism.R.layout.activity_home);
      sKeys.put("layout/activity_image_view_0", application.haveri.tourism.R.layout.activity_image_view);
      sKeys.put("layout/activity_map_single_0", application.haveri.tourism.R.layout.activity_map_single);
      sKeys.put("layout/activity_place_0", application.haveri.tourism.R.layout.activity_place);
      sKeys.put("layout/activity_setting_0", application.haveri.tourism.R.layout.activity_setting);
      sKeys.put("layout/activity_splash_0", application.haveri.tourism.R.layout.activity_splash);
      sKeys.put("layout/activity_taluk_0", application.haveri.tourism.R.layout.activity_taluk);
      sKeys.put("layout/activity_videos_explore_0", application.haveri.tourism.R.layout.activity_videos_explore);
      sKeys.put("layout/content_home_0", application.haveri.tourism.R.layout.content_home);
      sKeys.put("layout/fragment_explore_video_0", application.haveri.tourism.R.layout.fragment_explore_video);
      sKeys.put("layout/fragment_home_0", application.haveri.tourism.R.layout.fragment_home);
      sKeys.put("layout/fragment_home_content_0", application.haveri.tourism.R.layout.fragment_home_content);
      sKeys.put("layout/fragment_place_about_0", application.haveri.tourism.R.layout.fragment_place_about);
      sKeys.put("layout/fragment_place_detail_0", application.haveri.tourism.R.layout.fragment_place_detail);
      sKeys.put("layout/fragment_place_event_0", application.haveri.tourism.R.layout.fragment_place_event);
      sKeys.put("layout/fragment_place_image_gallery_0", application.haveri.tourism.R.layout.fragment_place_image_gallery);
      sKeys.put("layout/fragment_place_list_0", application.haveri.tourism.R.layout.fragment_place_list);
      sKeys.put("layout/fragment_place_videos_0", application.haveri.tourism.R.layout.fragment_place_videos);
      sKeys.put("layout-land/fragment_play_video_0", application.haveri.tourism.R.layout.fragment_play_video);
      sKeys.put("layout/fragment_play_video_0", application.haveri.tourism.R.layout.fragment_play_video);
      sKeys.put("layout/fragment_taluk_about_0", application.haveri.tourism.R.layout.fragment_taluk_about);
      sKeys.put("layout/fragment_taluk_detail_0", application.haveri.tourism.R.layout.fragment_taluk_detail);
      sKeys.put("layout/fragment_taluk_event_0", application.haveri.tourism.R.layout.fragment_taluk_event);
      sKeys.put("layout/fragment_taluk_image_gallery_0", application.haveri.tourism.R.layout.fragment_taluk_image_gallery);
      sKeys.put("layout/fragment_taluk_list_0", application.haveri.tourism.R.layout.fragment_taluk_list);
      sKeys.put("layout/fragment_taluk_places_0", application.haveri.tourism.R.layout.fragment_taluk_places);
      sKeys.put("layout/fragment_taluk_videos_0", application.haveri.tourism.R.layout.fragment_taluk_videos);
      sKeys.put("layout/layout_error_0", application.haveri.tourism.R.layout.layout_error);
      sKeys.put("layout/layout_event_item_0", application.haveri.tourism.R.layout.layout_event_item);
      sKeys.put("layout/layout_fullscreen_image_0", application.haveri.tourism.R.layout.layout_fullscreen_image);
      sKeys.put("layout/layout_home_event_item_0", application.haveri.tourism.R.layout.layout_home_event_item);
      sKeys.put("layout/layout_home_image_gallery_item_0", application.haveri.tourism.R.layout.layout_home_image_gallery_item);
      sKeys.put("layout/layout_home_place_item_0", application.haveri.tourism.R.layout.layout_home_place_item);
      sKeys.put("layout/layout_home_taluk_item_0", application.haveri.tourism.R.layout.layout_home_taluk_item);
      sKeys.put("layout/layout_image_gallery_item_0", application.haveri.tourism.R.layout.layout_image_gallery_item);
      sKeys.put("layout/layout_image_slider_item_0", application.haveri.tourism.R.layout.layout_image_slider_item);
      sKeys.put("layout/layout_map_0", application.haveri.tourism.R.layout.layout_map);
      sKeys.put("layout/layout_place_item_0", application.haveri.tourism.R.layout.layout_place_item);
      sKeys.put("layout/layout_taluk_item_0", application.haveri.tourism.R.layout.layout_taluk_item);
      sKeys.put("layout/layout_theme_list_item_0", application.haveri.tourism.R.layout.layout_theme_list_item);
      sKeys.put("layout/layout_toolbar_0", application.haveri.tourism.R.layout.layout_toolbar);
      sKeys.put("layout/layout_toolbar_home_0", application.haveri.tourism.R.layout.layout_toolbar_home);
      sKeys.put("layout/layout_video_list_item_0", application.haveri.tourism.R.layout.layout_video_list_item);
      sKeys.put("layout/test_0", application.haveri.tourism.R.layout.test);
    }
  }
}
