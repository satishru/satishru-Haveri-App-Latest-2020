package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlaceAboutBindingImpl extends FragmentPlaceAboutBinding implements application.haveri.tourism.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(1, 
            new String[] {"layout_map"},
            new int[] {13},
            new int[] {application.haveri.tourism.R.layout.layout_map});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final application.haveri.tourism.ui.custom.CustomTextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlaceAboutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentPlaceAboutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (application.haveri.tourism.databinding.LayoutMapBinding) bindings[13]
            , (android.widget.LinearLayout) bindings[2]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[12]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[10]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[11]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[6]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[3]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[4]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[8]
            );
        this.llDistance.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (application.haveri.tourism.ui.custom.CustomTextView) bindings[9];
        this.mboundView9.setTag(null);
        this.tvByAir.setTag(null);
        this.tvByRoad.setTag(null);
        this.tvByTrain.setTag(null);
        this.tvContactPhone.setTag(null);
        this.tvDistance.setTag(null);
        this.tvVisitTime.setTag(null);
        this.tvWebLink.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new application.haveri.tourism.generated.callback.OnClickListener(this, 1);
        mCallback24 = new application.haveri.tourism.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.placeObj == variableId) {
            setPlaceObj((application.haveri.tourism.data.model.api.response.haveri_data.Place) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((application.haveri.tourism.ui.fragment.place.place_details.about.PlaceAboutFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlaceObj(@Nullable application.haveri.tourism.data.model.api.response.haveri_data.Place PlaceObj) {
        this.mPlaceObj = PlaceObj;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.placeObj);
        super.requestRebind();
    }
    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.place.place_details.about.PlaceAboutFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
                return onChangeIncLayoutMap((application.haveri.tourism.databinding.LayoutMapBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncLayoutMap(application.haveri.tourism.databinding.LayoutMapBinding IncLayoutMap, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String placeObjByAirKn = null;
        boolean viewModelSelectedLanguageInt0 = false;
        java.lang.String placeObjByRoadKn = null;
        java.lang.String placeObjByTrainKn = null;
        java.lang.String viewModelSelectedLanguageInt0PlaceObjByTrainEnPlaceObjByTrainKn = null;
        java.lang.String viewModelSelectedLanguageInt0PlaceObjByRoadEnPlaceObjByRoadKn = null;
        java.lang.String viewModelSelectedLanguageInt0PlaceObjByAirEnPlaceObjByAirKn = null;
        application.haveri.tourism.data.model.api.response.haveri_data.Place placeObj = mPlaceObj;
        java.lang.String placeObjDescriptionKn = null;
        int commonUtilsCheckNullOrEmptyViewModelGetDistancePlaceObjViewGONEViewVISIBLE = 0;
        java.lang.String viewModelSelectedLanguageInt0PlaceObjDescriptionEnPlaceObjDescriptionKn = null;
        java.lang.String placeObjContactPhone = null;
        java.lang.String placeObjDescriptionEn = null;
        boolean commonUtilsCheckNullOrEmptyViewModelGetDistancePlaceObj = false;
        java.lang.String viewModelSelectedLanguageInt0PlaceObjContactPhonePlaceObjContactPhone = null;
        java.lang.String viewModelSelectedLanguageInt0PlaceObjWebLinkPlaceObjWebLink = null;
        java.lang.String placeObjWebLink = null;
        java.lang.String placeObjByTrainEn = null;
        java.lang.String viewModelGetVisitingTimePlaceObj = null;
        java.lang.String placeObjByRoadEn = null;
        int viewModelSelectedLanguage = 0;
        java.lang.String viewModelGetDistancePlaceObj = null;
        java.lang.String commonUtilsToHtmlViewModelSelectedLanguageInt0PlaceObjDescriptionEnPlaceObjDescriptionKn = null;
        java.lang.String placeObjByAirEn = null;
        application.haveri.tourism.ui.fragment.place.place_details.about.PlaceAboutFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xeL) != 0) {



                if (viewModel != null) {
                    // read viewModel.getVisitingTime(placeObj)
                    viewModelGetVisitingTimePlaceObj = viewModel.getVisitingTime(placeObj);
                    // read viewModel.selectedLanguage
                    viewModelSelectedLanguage = viewModel.getSelectedLanguage();
                    // read viewModel.getDistance(placeObj)
                    viewModelGetDistancePlaceObj = viewModel.getDistance(placeObj);
                }


                // read viewModel.selectedLanguage == 0
                viewModelSelectedLanguageInt0 = (viewModelSelectedLanguage) == (0);
                // read CommonUtils.checkNullOrEmpty(viewModel.getDistance(placeObj))
                commonUtilsCheckNullOrEmptyViewModelGetDistancePlaceObj = application.haveri.tourism.utils.CommonUtils.checkNullOrEmpty(viewModelGetDistancePlaceObj);
            if((dirtyFlags & 0xeL) != 0) {
                if(viewModelSelectedLanguageInt0) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
            }
            if((dirtyFlags & 0xeL) != 0) {
                if(commonUtilsCheckNullOrEmptyViewModelGetDistancePlaceObj) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read CommonUtils.checkNullOrEmpty(viewModel.getDistance(placeObj)) ? View.GONE : View.VISIBLE
                commonUtilsCheckNullOrEmptyViewModelGetDistancePlaceObjViewGONEViewVISIBLE = ((commonUtilsCheckNullOrEmptyViewModelGetDistancePlaceObj) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                if (placeObj != null) {
                    // read placeObj.byAirKn
                    placeObjByAirKn = placeObj.getByAirKn();
                }
        }
        if ((dirtyFlags & 0x40L) != 0) {

                if (placeObj != null) {
                    // read placeObj.byRoadKn
                    placeObjByRoadKn = placeObj.getByRoadKn();
                }
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (placeObj != null) {
                    // read placeObj.byTrainKn
                    placeObjByTrainKn = placeObj.getByTrainKn();
                }
        }
        if ((dirtyFlags & 0x1000L) != 0) {

                if (placeObj != null) {
                    // read placeObj.descriptionKn
                    placeObjDescriptionKn = placeObj.getDescriptionKn();
                }
        }
        if ((dirtyFlags & 0xc000L) != 0) {

                if (placeObj != null) {
                    // read placeObj.contactPhone
                    placeObjContactPhone = placeObj.getContactPhone();
                }
        }
        if ((dirtyFlags & 0x2000L) != 0) {

                if (placeObj != null) {
                    // read placeObj.descriptionEn
                    placeObjDescriptionEn = placeObj.getDescriptionEn();
                }
        }
        if ((dirtyFlags & 0x30000L) != 0) {

                if (placeObj != null) {
                    // read placeObj.webLink
                    placeObjWebLink = placeObj.getWebLink();
                }
        }
        if ((dirtyFlags & 0x20L) != 0) {

                if (placeObj != null) {
                    // read placeObj.byTrainEn
                    placeObjByTrainEn = placeObj.getByTrainEn();
                }
        }
        if ((dirtyFlags & 0x80L) != 0) {

                if (placeObj != null) {
                    // read placeObj.byRoadEn
                    placeObjByRoadEn = placeObj.getByRoadEn();
                }
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (placeObj != null) {
                    // read placeObj.byAirEn
                    placeObjByAirEn = placeObj.getByAirEn();
                }
        }

        if ((dirtyFlags & 0xeL) != 0) {

                // read viewModel.selectedLanguage == 0 ? placeObj.byTrainEn : placeObj.byTrainKn
                viewModelSelectedLanguageInt0PlaceObjByTrainEnPlaceObjByTrainKn = ((viewModelSelectedLanguageInt0) ? (placeObjByTrainEn) : (placeObjByTrainKn));
                // read viewModel.selectedLanguage == 0 ? placeObj.byRoadEn : placeObj.byRoadKn
                viewModelSelectedLanguageInt0PlaceObjByRoadEnPlaceObjByRoadKn = ((viewModelSelectedLanguageInt0) ? (placeObjByRoadEn) : (placeObjByRoadKn));
                // read viewModel.selectedLanguage == 0 ? placeObj.byAirEn : placeObj.byAirKn
                viewModelSelectedLanguageInt0PlaceObjByAirEnPlaceObjByAirKn = ((viewModelSelectedLanguageInt0) ? (placeObjByAirEn) : (placeObjByAirKn));
                // read viewModel.selectedLanguage == 0 ? placeObj.descriptionEn : placeObj.descriptionKn
                viewModelSelectedLanguageInt0PlaceObjDescriptionEnPlaceObjDescriptionKn = ((viewModelSelectedLanguageInt0) ? (placeObjDescriptionEn) : (placeObjDescriptionKn));
                // read viewModel.selectedLanguage == 0 ? placeObj.contactPhone : placeObj.contactPhone
                viewModelSelectedLanguageInt0PlaceObjContactPhonePlaceObjContactPhone = ((viewModelSelectedLanguageInt0) ? (placeObjContactPhone) : (placeObjContactPhone));
                // read viewModel.selectedLanguage == 0 ? placeObj.webLink : placeObj.webLink
                viewModelSelectedLanguageInt0PlaceObjWebLinkPlaceObjWebLink = ((viewModelSelectedLanguageInt0) ? (placeObjWebLink) : (placeObjWebLink));


                // read CommonUtils.toHtml(viewModel.selectedLanguage == 0 ? placeObj.descriptionEn : placeObj.descriptionKn)
                commonUtilsToHtmlViewModelSelectedLanguageInt0PlaceObjDescriptionEnPlaceObjDescriptionKn = application.haveri.tourism.utils.CommonUtils.toHtml(viewModelSelectedLanguageInt0PlaceObjDescriptionEnPlaceObjDescriptionKn);
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.llDistance.setVisibility(commonUtilsCheckNullOrEmptyViewModelGetDistancePlaceObjViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, commonUtilsToHtmlViewModelSelectedLanguageInt0PlaceObjDescriptionEnPlaceObjDescriptionKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByAir, viewModelSelectedLanguageInt0PlaceObjByAirEnPlaceObjByAirKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByRoad, viewModelSelectedLanguageInt0PlaceObjByRoadEnPlaceObjByRoadKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByTrain, viewModelSelectedLanguageInt0PlaceObjByTrainEnPlaceObjByTrainKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContactPhone, viewModelSelectedLanguageInt0PlaceObjContactPhonePlaceObjContactPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDistance, viewModelGetDistancePlaceObj);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVisitTime, viewModelGetVisitingTimePlaceObj);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvWebLink, viewModelSelectedLanguageInt0PlaceObjWebLinkPlaceObjWebLink);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(mCallback23);
            this.mboundView7.setOnClickListener(mCallback24);
        }
        executeBindingsOn(incLayoutMap);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.fragment.place.place_details.about.PlaceAboutFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // placeObj
                application.haveri.tourism.data.model.api.response.haveri_data.Place placeObj = mPlaceObj;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.makePhoneCall(placeObj);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.fragment.place.place_details.about.PlaceAboutFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // placeObj
                application.haveri.tourism.data.model.api.response.haveri_data.Place placeObj = mPlaceObj;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.openWebLink(placeObj);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): incLayoutMap
        flag 1 (0x2L): placeObj
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.selectedLanguage == 0 ? placeObj.byTrainEn : placeObj.byTrainKn
        flag 5 (0x6L): viewModel.selectedLanguage == 0 ? placeObj.byTrainEn : placeObj.byTrainKn
        flag 6 (0x7L): viewModel.selectedLanguage == 0 ? placeObj.byRoadEn : placeObj.byRoadKn
        flag 7 (0x8L): viewModel.selectedLanguage == 0 ? placeObj.byRoadEn : placeObj.byRoadKn
        flag 8 (0x9L): viewModel.selectedLanguage == 0 ? placeObj.byAirEn : placeObj.byAirKn
        flag 9 (0xaL): viewModel.selectedLanguage == 0 ? placeObj.byAirEn : placeObj.byAirKn
        flag 10 (0xbL): CommonUtils.checkNullOrEmpty(viewModel.getDistance(placeObj)) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): CommonUtils.checkNullOrEmpty(viewModel.getDistance(placeObj)) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): viewModel.selectedLanguage == 0 ? placeObj.descriptionEn : placeObj.descriptionKn
        flag 13 (0xeL): viewModel.selectedLanguage == 0 ? placeObj.descriptionEn : placeObj.descriptionKn
        flag 14 (0xfL): viewModel.selectedLanguage == 0 ? placeObj.contactPhone : placeObj.contactPhone
        flag 15 (0x10L): viewModel.selectedLanguage == 0 ? placeObj.contactPhone : placeObj.contactPhone
        flag 16 (0x11L): viewModel.selectedLanguage == 0 ? placeObj.webLink : placeObj.webLink
        flag 17 (0x12L): viewModel.selectedLanguage == 0 ? placeObj.webLink : placeObj.webLink
    flag mapping end*/
    //end
}