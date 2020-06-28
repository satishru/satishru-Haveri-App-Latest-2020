package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEventDetailBindingImpl extends ActivityEventDetailBinding implements application.haveri.tourism.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(0, 
            new String[] {"layout_toolbar"},
            new int[] {9},
            new int[] {application.haveri.tourism.R.layout.layout_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_content, 10);
        sViewsWithIds.put(R.id.youtube_player_view, 11);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEventDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityEventDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (application.haveri.tourism.databinding.LayoutToolbarBinding) bindings[9]
            , (android.widget.RelativeLayout) bindings[10]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[7]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[6]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[8]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[3]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[5]
            , (com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView) bindings[11]
            );
        this.btnPlay.setTag(null);
        this.ivMapDirection.setTag(null);
        this.ivThumb.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEventAddress.setTag(null);
        this.tvEventDate.setTag(null);
        this.tvEventDetail.setTag(null);
        this.tvEventTitle.setTag(null);
        this.tvPlaceTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new application.haveri.tourism.generated.callback.OnClickListener(this, 1);
        mCallback26 = new application.haveri.tourism.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
        }
        layoutToolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutToolbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((application.haveri.tourism.ui.activity.event.EventDetailActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.activity.event.EventDetailActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutToolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsImageExist((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelEventImage((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelIsVideoExist((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelEventPlace((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeLayoutToolbar((application.haveri.tourism.databinding.LayoutToolbarBinding) object, fieldId);
            case 5 :
                return onChangeViewModelEventDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelIsNavigationExits((androidx.databinding.ObservableBoolean) object, fieldId);
            case 7 :
                return onChangeViewModelEventAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelEventDetails((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelEventTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsImageExist(androidx.databinding.ObservableBoolean ViewModelIsImageExist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventImage(androidx.databinding.ObservableField<java.lang.String> ViewModelEventImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsVideoExist(androidx.databinding.ObservableBoolean ViewModelIsVideoExist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventPlace(androidx.databinding.ObservableField<java.lang.String> ViewModelEventPlace, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutToolbar(application.haveri.tourism.databinding.LayoutToolbarBinding LayoutToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventDate(androidx.databinding.ObservableField<java.lang.String> ViewModelEventDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNavigationExits(androidx.databinding.ObservableBoolean ViewModelIsNavigationExits, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventAddress(androidx.databinding.ObservableField<java.lang.String> ViewModelEventAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventDetails(androidx.databinding.ObservableField<java.lang.String> ViewModelEventDetails, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelEventTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.lang.String viewModelEventDateGet = null;
        java.lang.String commonUtilsToHtmlViewModelEventDetails = null;
        java.lang.String viewModelEventAddressGet = null;
        androidx.databinding.ObservableBoolean viewModelIsImageExist = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEventImage = null;
        int viewModelIsImageExistBooleanTrueViewModelIsVideoExistViewVISIBLEViewGONE = 0;
        boolean viewModelIsNavigationExitsGet = false;
        androidx.databinding.ObservableBoolean viewModelIsVideoExist = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEventPlace = null;
        java.lang.String viewModelEventImageGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEventDate = null;
        int viewModelIsNavigationExitsViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewModelIsNavigationExits = null;
        boolean viewModelIsImageExistBooleanTrueViewModelIsVideoExist = false;
        java.lang.String viewModelEventTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEventAddress = null;
        java.lang.String viewModelEventDetailsGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelEventDetails = null;
        boolean viewModelIsVideoExistGet = false;
        boolean viewModelIsImageExistGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelEventTitle = null;
        application.haveri.tourism.ui.activity.event.EventDetailActivityViewModel viewModel = mViewModel;
        int viewModelIsVideoExistViewVISIBLEViewGONE = 0;
        java.lang.String viewModelEventPlaceGet = null;

        if ((dirtyFlags & 0xfefL) != 0) {


            if ((dirtyFlags & 0xc05L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isImageExist
                        viewModelIsImageExist = viewModel.isImageExist;
                    }
                    updateRegistration(0, viewModelIsImageExist);


                    if (viewModelIsImageExist != null) {
                        // read viewModel.isImageExist.get()
                        viewModelIsImageExistGet = viewModelIsImageExist.get();
                    }
                if((dirtyFlags & 0xc05L) != 0) {
                    if(viewModelIsImageExistGet) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc02L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eventImage
                        viewModelEventImage = viewModel.eventImage;
                    }
                    updateRegistration(1, viewModelEventImage);


                    if (viewModelEventImage != null) {
                        // read viewModel.eventImage.get()
                        viewModelEventImageGet = viewModelEventImage.get();
                    }
            }
            if ((dirtyFlags & 0xc04L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isVideoExist
                        viewModelIsVideoExist = viewModel.isVideoExist;
                    }
                    updateRegistration(2, viewModelIsVideoExist);


                    if (viewModelIsVideoExist != null) {
                        // read viewModel.isVideoExist.get()
                        viewModelIsVideoExistGet = viewModelIsVideoExist.get();
                    }
                if((dirtyFlags & 0xc04L) != 0) {
                    if(viewModelIsVideoExistGet) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.isVideoExist.get() ? View.VISIBLE : View.GONE
                    viewModelIsVideoExistViewVISIBLEViewGONE = ((viewModelIsVideoExistGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc08L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eventPlace
                        viewModelEventPlace = viewModel.eventPlace;
                    }
                    updateRegistration(3, viewModelEventPlace);


                    if (viewModelEventPlace != null) {
                        // read viewModel.eventPlace.get()
                        viewModelEventPlaceGet = viewModelEventPlace.get();
                    }
            }
            if ((dirtyFlags & 0xc20L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eventDate
                        viewModelEventDate = viewModel.eventDate;
                    }
                    updateRegistration(5, viewModelEventDate);


                    if (viewModelEventDate != null) {
                        // read viewModel.eventDate.get()
                        viewModelEventDateGet = viewModelEventDate.get();
                    }
            }
            if ((dirtyFlags & 0xc40L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNavigationExits
                        viewModelIsNavigationExits = viewModel.isNavigationExits;
                    }
                    updateRegistration(6, viewModelIsNavigationExits);


                    if (viewModelIsNavigationExits != null) {
                        // read viewModel.isNavigationExits.get()
                        viewModelIsNavigationExitsGet = viewModelIsNavigationExits.get();
                    }
                if((dirtyFlags & 0xc40L) != 0) {
                    if(viewModelIsNavigationExitsGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewModel.isNavigationExits.get() ? View.VISIBLE : View.GONE
                    viewModelIsNavigationExitsViewVISIBLEViewGONE = ((viewModelIsNavigationExitsGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc80L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eventAddress
                        viewModelEventAddress = viewModel.eventAddress;
                    }
                    updateRegistration(7, viewModelEventAddress);


                    if (viewModelEventAddress != null) {
                        // read viewModel.eventAddress.get()
                        viewModelEventAddressGet = viewModelEventAddress.get();
                    }
            }
            if ((dirtyFlags & 0xd00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eventDetails
                        viewModelEventDetails = viewModel.eventDetails;
                    }
                    updateRegistration(8, viewModelEventDetails);


                    if (viewModelEventDetails != null) {
                        // read viewModel.eventDetails.get()
                        viewModelEventDetailsGet = viewModelEventDetails.get();
                    }


                    // read CommonUtils.toHtml(viewModel.eventDetails.get())
                    commonUtilsToHtmlViewModelEventDetails = application.haveri.tourism.utils.CommonUtils.toHtml(viewModelEventDetailsGet);
            }
            if ((dirtyFlags & 0xe00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.eventTitle
                        viewModelEventTitle = viewModel.eventTitle;
                    }
                    updateRegistration(9, viewModelEventTitle);


                    if (viewModelEventTitle != null) {
                        // read viewModel.eventTitle.get()
                        viewModelEventTitleGet = viewModelEventTitle.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isVideoExist
                    viewModelIsVideoExist = viewModel.isVideoExist;
                }
                updateRegistration(2, viewModelIsVideoExist);


                if (viewModelIsVideoExist != null) {
                    // read viewModel.isVideoExist.get()
                    viewModelIsVideoExistGet = viewModelIsVideoExist.get();
                }
            if((dirtyFlags & 0xc04L) != 0) {
                if(viewModelIsVideoExistGet) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }
        }

        if ((dirtyFlags & 0xc05L) != 0) {

                // read viewModel.isImageExist.get() ? true : viewModel.isVideoExist.get()
                viewModelIsImageExistBooleanTrueViewModelIsVideoExist = ((viewModelIsImageExistGet) ? (true) : (viewModelIsVideoExistGet));
            if((dirtyFlags & 0xc05L) != 0) {
                if(viewModelIsImageExistBooleanTrueViewModelIsVideoExist) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read viewModel.isImageExist.get() ? true : viewModel.isVideoExist.get() ? View.VISIBLE : View.GONE
                viewModelIsImageExistBooleanTrueViewModelIsVideoExistViewVISIBLEViewGONE = ((viewModelIsImageExistBooleanTrueViewModelIsVideoExist) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.btnPlay.setOnClickListener(mCallback25);
            this.ivMapDirection.setOnClickListener(mCallback26);
        }
        if ((dirtyFlags & 0xc04L) != 0) {
            // api target 1

            this.btnPlay.setVisibility(viewModelIsVideoExistViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc40L) != 0) {
            // api target 1

            this.ivMapDirection.setVisibility(viewModelIsNavigationExitsViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc05L) != 0) {
            // api target 1

            this.ivThumb.setVisibility(viewModelIsImageExistBooleanTrueViewModelIsVideoExistViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc02L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setImageUrl(this.ivThumb, viewModelEventImageGet);
        }
        if ((dirtyFlags & 0xc80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEventAddress, viewModelEventAddressGet);
        }
        if ((dirtyFlags & 0xc20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEventDate, viewModelEventDateGet);
        }
        if ((dirtyFlags & 0xd00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEventDetail, commonUtilsToHtmlViewModelEventDetails);
        }
        if ((dirtyFlags & 0xe00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEventTitle, viewModelEventTitleGet);
        }
        if ((dirtyFlags & 0xc08L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPlaceTitle, viewModelEventPlaceGet);
        }
        executeBindingsOn(layoutToolbar);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.activity.event.EventDetailActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onButtonPlayClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.activity.event.EventDetailActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onNavigateImageClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isImageExist
        flag 1 (0x2L): viewModel.eventImage
        flag 2 (0x3L): viewModel.isVideoExist
        flag 3 (0x4L): viewModel.eventPlace
        flag 4 (0x5L): layoutToolbar
        flag 5 (0x6L): viewModel.eventDate
        flag 6 (0x7L): viewModel.isNavigationExits
        flag 7 (0x8L): viewModel.eventAddress
        flag 8 (0x9L): viewModel.eventDetails
        flag 9 (0xaL): viewModel.eventTitle
        flag 10 (0xbL): viewModel
        flag 11 (0xcL): null
        flag 12 (0xdL): viewModel.isImageExist.get() ? true : viewModel.isVideoExist.get() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.isImageExist.get() ? true : viewModel.isVideoExist.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.isNavigationExits.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.isNavigationExits.get() ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.isImageExist.get() ? true : viewModel.isVideoExist.get()
        flag 17 (0x12L): viewModel.isImageExist.get() ? true : viewModel.isVideoExist.get()
        flag 18 (0x13L): viewModel.isVideoExist.get() ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.isVideoExist.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}