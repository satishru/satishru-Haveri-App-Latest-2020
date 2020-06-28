package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeContentBindingImpl extends FragmentHomeContentBinding implements application.haveri.tourism.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(24);
        sIncludes.setIncludes(1, 
            new String[] {"layout_map"},
            new int[] {16},
            new int[] {application.haveri.tourism.R.layout.layout_map});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_taluk, 17);
        sViewsWithIds.put(R.id.card_places, 18);
        sViewsWithIds.put(R.id.adView, 19);
        sViewsWithIds.put(R.id.rl_content, 20);
        sViewsWithIds.put(R.id.btn_play, 21);
        sViewsWithIds.put(R.id.card_gallery, 22);
        sViewsWithIds.put(R.id.card_how_to_reach, 23);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final application.haveri.tourism.ui.custom.CustomTextView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeContentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentHomeContentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.google.android.gms.ads.AdView) bindings[19]
            , (android.widget.ImageView) bindings[21]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[23]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (application.haveri.tourism.databinding.LayoutMapBinding) bindings[16]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[15]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[13]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[14]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[9]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[4]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[2]
            );
        this.cardEvents.setTag(null);
        this.cardVideo.setTag(null);
        this.ivVideoThumb.setTag(null);
        this.llContent.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView8 = (application.haveri.tourism.ui.custom.CustomTextView) bindings[8];
        this.mboundView8.setTag(null);
        this.rvEventList.setTag(null);
        this.rvImageList.setTag(null);
        this.rvPlaceList.setTag(null);
        this.rvTalukList.setTag(null);
        this.tvByAir.setTag(null);
        this.tvByRoad.setTag(null);
        this.tvByTrain.setTag(null);
        this.tvImageViewAll.setTag(null);
        this.tvPlaceViewAll.setTag(null);
        this.tvViewAll.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new application.haveri.tourism.generated.callback.OnClickListener(this, 4);
        mCallback16 = new application.haveri.tourism.generated.callback.OnClickListener(this, 1);
        mCallback17 = new application.haveri.tourism.generated.callback.OnClickListener(this, 2);
        mCallback20 = new application.haveri.tourism.generated.callback.OnClickListener(this, 5);
        mCallback18 = new application.haveri.tourism.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        incLayoutMap.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (incLayoutMap.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        incLayoutMap.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPlaceList((androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Place>>) object, fieldId);
            case 1 :
                return onChangeViewModelEventList((androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Event>>) object, fieldId);
            case 2 :
                return onChangeViewModelDistrict((androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.District>) object, fieldId);
            case 3 :
                return onChangeViewModelRandomVideo((androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.Videos>) object, fieldId);
            case 4 :
                return onChangeViewModelImageList((androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Images>>) object, fieldId);
            case 5 :
                return onChangeViewModelVideosList((androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Videos>>) object, fieldId);
            case 6 :
                return onChangeIncLayoutMap((application.haveri.tourism.databinding.LayoutMapBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPlaceList(androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Place>> ViewModelPlaceList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventList(androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Event>> ViewModelEventList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDistrict(androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.District> ViewModelDistrict, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRandomVideo(androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.Videos> ViewModelRandomVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelImageList(androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Images>> ViewModelImageList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVideosList(androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Videos>> ViewModelVideosList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncLayoutMap(application.haveri.tourism.databinding.LayoutMapBinding IncLayoutMap, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Place>> viewModelPlaceList = null;
        boolean viewModelVideosListSizeInt0 = false;
        java.lang.String viewModelRandomVideoVedioUrl = null;
        androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Event>> viewModelEventList = null;
        androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.District> viewModelDistrict = null;
        java.lang.String viewModelDistrictByAirEn = null;
        java.lang.String viewModelDistrictByTrainKn = null;
        java.lang.String viewModelDistrictByRoadEn = null;
        java.lang.String viewModelSelectedLanguageInt0ViewModelDistrictByRoadEnViewModelDistrictByRoadKn = null;
        androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.Videos> viewModelRandomVideo = null;
        java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Videos> viewModelVideosListGetValue = null;
        java.lang.String viewModelSelectedLanguageInt0ViewModelDistrictByTrainEnViewModelDistrictByTrainKn = null;
        java.lang.String viewModelSelectedLanguageInt0ViewModelDistrictByAirEnViewModelDistrictByAirKn = null;
        int viewModelVideosListSizeInt0ViewVISIBLEViewGONE = 0;
        boolean viewModelSelectedLanguageInt0 = false;
        boolean viewModelEventListSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Images>> viewModelImageList = null;
        java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Taluk> viewModelDistrictTaluks = null;
        java.lang.String viewModelDistrictByRoadKn = null;
        java.lang.String viewModelDistrictByAirKn = null;
        java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Place> viewModelPlaceListGetValue = null;
        int viewModelEventListSizeInt0ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Videos>> viewModelVideosList = null;
        java.lang.String viewModelDistrictByTrainEn = null;
        int viewModelVideosListSize = 0;
        application.haveri.tourism.data.model.api.response.haveri_data.Videos viewModelRandomVideoGetValue = null;
        java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Event> viewModelEventListGetValue = null;
        application.haveri.tourism.data.model.api.response.haveri_data.District viewModelDistrictGetValue = null;
        int viewModelSelectedLanguage = 0;
        application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel viewModel = mViewModel;
        int viewModelEventListSize = 0;
        java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Images> viewModelImageListGetValue = null;

        if ((dirtyFlags & 0x1bfL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.placeList
                        viewModelPlaceList = viewModel.getPlaceList();
                    }
                    updateLiveDataRegistration(0, viewModelPlaceList);


                    if (viewModelPlaceList != null) {
                        // read viewModel.placeList.getValue()
                        viewModelPlaceListGetValue = viewModelPlaceList.getValue();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eventList
                        viewModelEventList = viewModel.getEventList();
                    }
                    updateLiveDataRegistration(1, viewModelEventList);


                    if (viewModelEventList != null) {
                        // read viewModel.eventList.getValue()
                        viewModelEventListGetValue = viewModelEventList.getValue();
                    }


                    if (viewModelEventListGetValue != null) {
                        // read viewModel.eventList.getValue().size()
                        viewModelEventListSize = viewModelEventListGetValue.size();
                    }


                    // read viewModel.eventList.getValue().size() > 0
                    viewModelEventListSizeInt0 = (viewModelEventListSize) > (0);
                if((dirtyFlags & 0x182L) != 0) {
                    if(viewModelEventListSizeInt0) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read viewModel.eventList.getValue().size() > 0 ? View.VISIBLE : View.GONE
                    viewModelEventListSizeInt0ViewVISIBLEViewGONE = ((viewModelEventListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.district
                        viewModelDistrict = viewModel.getDistrict();
                        // read viewModel.selectedLanguage
                        viewModelSelectedLanguage = viewModel.getSelectedLanguage();
                    }
                    updateLiveDataRegistration(2, viewModelDistrict);


                    if (viewModelDistrict != null) {
                        // read viewModel.district.getValue()
                        viewModelDistrictGetValue = viewModelDistrict.getValue();
                    }
                    // read viewModel.selectedLanguage == 0
                    viewModelSelectedLanguageInt0 = (viewModelSelectedLanguage) == (0);
                if((dirtyFlags & 0x184L) != 0) {
                    if(viewModelSelectedLanguageInt0) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                    }
                }


                    if (viewModelDistrictGetValue != null) {
                        // read viewModel.district.getValue().taluks
                        viewModelDistrictTaluks = viewModelDistrictGetValue.getTaluks();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.randomVideo
                        viewModelRandomVideo = viewModel.getRandomVideo();
                    }
                    updateLiveDataRegistration(3, viewModelRandomVideo);


                    if (viewModelRandomVideo != null) {
                        // read viewModel.randomVideo.getValue()
                        viewModelRandomVideoGetValue = viewModelRandomVideo.getValue();
                    }


                    if (viewModelRandomVideoGetValue != null) {
                        // read viewModel.randomVideo.getValue().vedioUrl
                        viewModelRandomVideoVedioUrl = viewModelRandomVideoGetValue.getVedioUrl();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageList
                        viewModelImageList = viewModel.getImageList();
                    }
                    updateLiveDataRegistration(4, viewModelImageList);


                    if (viewModelImageList != null) {
                        // read viewModel.imageList.getValue()
                        viewModelImageListGetValue = viewModelImageList.getValue();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videosList
                        viewModelVideosList = viewModel.getVideosList();
                    }
                    updateLiveDataRegistration(5, viewModelVideosList);


                    if (viewModelVideosList != null) {
                        // read viewModel.videosList.getValue()
                        viewModelVideosListGetValue = viewModelVideosList.getValue();
                    }


                    if (viewModelVideosListGetValue != null) {
                        // read viewModel.videosList.getValue().size()
                        viewModelVideosListSize = viewModelVideosListGetValue.size();
                    }


                    // read viewModel.videosList.getValue().size() > 0
                    viewModelVideosListSizeInt0 = (viewModelVideosListSize) > (0);
                if((dirtyFlags & 0x1a0L) != 0) {
                    if(viewModelVideosListSizeInt0) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read viewModel.videosList.getValue().size() > 0 ? View.VISIBLE : View.GONE
                    viewModelVideosListSizeInt0ViewVISIBLEViewGONE = ((viewModelVideosListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {

                if (viewModelDistrictGetValue != null) {
                    // read viewModel.district.getValue().byAirEn
                    viewModelDistrictByAirEn = viewModelDistrictGetValue.getByAirEn();
                }
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (viewModelDistrictGetValue != null) {
                    // read viewModel.district.getValue().byTrainKn
                    viewModelDistrictByTrainKn = viewModelDistrictGetValue.getByTrainKn();
                }
        }
        if ((dirtyFlags & 0x400L) != 0) {

                if (viewModelDistrictGetValue != null) {
                    // read viewModel.district.getValue().byRoadEn
                    viewModelDistrictByRoadEn = viewModelDistrictGetValue.getByRoadEn();
                }
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (viewModelDistrictGetValue != null) {
                    // read viewModel.district.getValue().byRoadKn
                    viewModelDistrictByRoadKn = viewModelDistrictGetValue.getByRoadKn();
                }
        }
        if ((dirtyFlags & 0x2000L) != 0) {

                if (viewModelDistrictGetValue != null) {
                    // read viewModel.district.getValue().byAirKn
                    viewModelDistrictByAirKn = viewModelDistrictGetValue.getByAirKn();
                }
        }
        if ((dirtyFlags & 0x1000L) != 0) {

                if (viewModelDistrictGetValue != null) {
                    // read viewModel.district.getValue().byTrainEn
                    viewModelDistrictByTrainEn = viewModelDistrictGetValue.getByTrainEn();
                }
        }

        if ((dirtyFlags & 0x184L) != 0) {

                // read viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byRoadEn : viewModel.district.getValue().byRoadKn
                viewModelSelectedLanguageInt0ViewModelDistrictByRoadEnViewModelDistrictByRoadKn = ((viewModelSelectedLanguageInt0) ? (viewModelDistrictByRoadEn) : (viewModelDistrictByRoadKn));
                // read viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byTrainEn : viewModel.district.getValue().byTrainKn
                viewModelSelectedLanguageInt0ViewModelDistrictByTrainEnViewModelDistrictByTrainKn = ((viewModelSelectedLanguageInt0) ? (viewModelDistrictByTrainEn) : (viewModelDistrictByTrainKn));
                // read viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byAirEn : viewModel.district.getValue().byAirKn
                viewModelSelectedLanguageInt0ViewModelDistrictByAirEnViewModelDistrictByAirKn = ((viewModelSelectedLanguageInt0) ? (viewModelDistrictByAirEn) : (viewModelDistrictByAirKn));
        }
        // batch finished
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            this.cardEvents.setVisibility(viewModelEventListSizeInt0ViewVISIBLEViewGONE);
            application.haveri.tourism.utils.BindingUtils.addEventItems(this.rvEventList, viewModelEventListGetValue);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            this.cardVideo.setVisibility(viewModelVideosListSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.ivVideoThumb.setOnClickListener(mCallback18);
            this.mboundView8.setOnClickListener(mCallback19);
            this.tvImageViewAll.setOnClickListener(mCallback20);
            this.tvPlaceViewAll.setOnClickListener(mCallback17);
            this.tvViewAll.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setYouTubeImageUrl(this.ivVideoThumb, viewModelRandomVideoVedioUrl);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.addImageGalleryItems(this.rvImageList, viewModelImageListGetValue);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.addPlaceItems(this.rvPlaceList, viewModelPlaceListGetValue);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.addTalukItems(this.rvTalukList, viewModelDistrictTaluks);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByAir, viewModelSelectedLanguageInt0ViewModelDistrictByAirEnViewModelDistrictByAirKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByRoad, viewModelSelectedLanguageInt0ViewModelDistrictByRoadEnViewModelDistrictByRoadKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByTrain, viewModelSelectedLanguageInt0ViewModelDistrictByTrainEnViewModelDistrictByTrainKn);
        }
        executeBindingsOn(incLayoutMap);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onExploreVideoClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onTalukListViewAllClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onPlaceListViewAllClicked();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onImageListViewAllClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onVideoClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.placeList
        flag 1 (0x2L): viewModel.eventList
        flag 2 (0x3L): viewModel.district
        flag 3 (0x4L): viewModel.randomVideo
        flag 4 (0x5L): viewModel.imageList
        flag 5 (0x6L): viewModel.videosList
        flag 6 (0x7L): incLayoutMap
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byRoadEn : viewModel.district.getValue().byRoadKn
        flag 10 (0xbL): viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byRoadEn : viewModel.district.getValue().byRoadKn
        flag 11 (0xcL): viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byTrainEn : viewModel.district.getValue().byTrainKn
        flag 12 (0xdL): viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byTrainEn : viewModel.district.getValue().byTrainKn
        flag 13 (0xeL): viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byAirEn : viewModel.district.getValue().byAirKn
        flag 14 (0xfL): viewModel.selectedLanguage == 0 ? viewModel.district.getValue().byAirEn : viewModel.district.getValue().byAirKn
        flag 15 (0x10L): viewModel.videosList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.videosList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.eventList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.eventList.getValue().size() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}