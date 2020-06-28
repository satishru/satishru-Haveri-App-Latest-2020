package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTalukAboutBindingImpl extends FragmentTalukAboutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"layout_map"},
            new int[] {6},
            new int[] {application.haveri.tourism.R.layout.layout_map});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final application.haveri.tourism.ui.custom.CustomTextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTalukAboutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentTalukAboutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (application.haveri.tourism.databinding.LayoutMapBinding) bindings[6]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[5]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[3]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (application.haveri.tourism.ui.custom.CustomTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvByAir.setTag(null);
        this.tvByRoad.setTag(null);
        this.tvByTrain.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.talukObj == variableId) {
            setTalukObj((application.haveri.tourism.data.model.api.response.haveri_data.Taluk) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((application.haveri.tourism.ui.fragment.taluk.taluk_detail.about.TalukAboutFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTalukObj(@Nullable application.haveri.tourism.data.model.api.response.haveri_data.Taluk TalukObj) {
        this.mTalukObj = TalukObj;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.talukObj);
        super.requestRebind();
    }
    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.taluk.taluk_detail.about.TalukAboutFragmentViewModel ViewModel) {
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
        application.haveri.tourism.data.model.api.response.haveri_data.Taluk talukObj = mTalukObj;
        java.lang.String talukObjByRoadEn = null;
        java.lang.String commonUtilsToHtmlViewModelSelectedLanguageInt0TalukObjDescriptionEnTalukObjDescriptionKn = null;
        boolean viewModelSelectedLanguageInt0 = false;
        java.lang.String talukObjByTrainKn = null;
        java.lang.String talukObjByTrainEn = null;
        java.lang.String talukObjByAirEn = null;
        java.lang.String viewModelSelectedLanguageInt0TalukObjByAirEnTalukObjByAirKn = null;
        java.lang.String viewModelSelectedLanguageInt0TalukObjByRoadEnTalukObjByRoadKn = null;
        java.lang.String talukObjDescriptionEn = null;
        int viewModelSelectedLanguage = 0;
        java.lang.String talukObjByAirKn = null;
        java.lang.String talukObjDescriptionKn = null;
        java.lang.String talukObjByRoadKn = null;
        java.lang.String viewModelSelectedLanguageInt0TalukObjByTrainEnTalukObjByTrainKn = null;
        application.haveri.tourism.ui.fragment.taluk.taluk_detail.about.TalukAboutFragmentViewModel viewModel = mViewModel;
        java.lang.String viewModelSelectedLanguageInt0TalukObjDescriptionEnTalukObjDescriptionKn = null;

        if ((dirtyFlags & 0xeL) != 0) {



                if (viewModel != null) {
                    // read viewModel.selectedLanguage
                    viewModelSelectedLanguage = viewModel.getSelectedLanguage();
                }


                // read viewModel.selectedLanguage == 0
                viewModelSelectedLanguageInt0 = (viewModelSelectedLanguage) == (0);
            if((dirtyFlags & 0xeL) != 0) {
                if(viewModelSelectedLanguageInt0) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xff0L) != 0) {


            if ((dirtyFlags & 0x80L) != 0) {

                    if (talukObj != null) {
                        // read talukObj.byRoadEn
                        talukObjByRoadEn = talukObj.getByRoadEn();
                    }
            }
            if ((dirtyFlags & 0x100L) != 0) {

                    if (talukObj != null) {
                        // read talukObj.byTrainKn
                        talukObjByTrainKn = talukObj.getByTrainKn();
                    }
            }
            if ((dirtyFlags & 0x200L) != 0) {

                    if (talukObj != null) {
                        // read talukObj.byTrainEn
                        talukObjByTrainEn = talukObj.getByTrainEn();
                    }
            }
            if ((dirtyFlags & 0x20L) != 0) {

                    if (talukObj != null) {
                        // read talukObj.byAirEn
                        talukObjByAirEn = talukObj.getByAirEn();
                    }
            }
            if ((dirtyFlags & 0x800L) != 0) {

                    if (talukObj != null) {
                        // read talukObj.descriptionEn
                        talukObjDescriptionEn = talukObj.getDescriptionEn();
                    }
            }
            if ((dirtyFlags & 0x10L) != 0) {

                    if (talukObj != null) {
                        // read talukObj.byAirKn
                        talukObjByAirKn = talukObj.getByAirKn();
                    }
            }
            if ((dirtyFlags & 0x400L) != 0) {

                    if (talukObj != null) {
                        // read talukObj.descriptionKn
                        talukObjDescriptionKn = talukObj.getDescriptionKn();
                    }
            }
            if ((dirtyFlags & 0x40L) != 0) {

                    if (talukObj != null) {
                        // read talukObj.byRoadKn
                        talukObjByRoadKn = talukObj.getByRoadKn();
                    }
            }
        }

        if ((dirtyFlags & 0xeL) != 0) {

                // read viewModel.selectedLanguage == 0 ? talukObj.byAirEn : talukObj.byAirKn
                viewModelSelectedLanguageInt0TalukObjByAirEnTalukObjByAirKn = ((viewModelSelectedLanguageInt0) ? (talukObjByAirEn) : (talukObjByAirKn));
                // read viewModel.selectedLanguage == 0 ? talukObj.byRoadEn : talukObj.byRoadKn
                viewModelSelectedLanguageInt0TalukObjByRoadEnTalukObjByRoadKn = ((viewModelSelectedLanguageInt0) ? (talukObjByRoadEn) : (talukObjByRoadKn));
                // read viewModel.selectedLanguage == 0 ? talukObj.byTrainEn : talukObj.byTrainKn
                viewModelSelectedLanguageInt0TalukObjByTrainEnTalukObjByTrainKn = ((viewModelSelectedLanguageInt0) ? (talukObjByTrainEn) : (talukObjByTrainKn));
                // read viewModel.selectedLanguage == 0 ? talukObj.descriptionEn : talukObj.descriptionKn
                viewModelSelectedLanguageInt0TalukObjDescriptionEnTalukObjDescriptionKn = ((viewModelSelectedLanguageInt0) ? (talukObjDescriptionEn) : (talukObjDescriptionKn));


                // read CommonUtils.toHtml(viewModel.selectedLanguage == 0 ? talukObj.descriptionEn : talukObj.descriptionKn)
                commonUtilsToHtmlViewModelSelectedLanguageInt0TalukObjDescriptionEnTalukObjDescriptionKn = application.haveri.tourism.utils.CommonUtils.toHtml(viewModelSelectedLanguageInt0TalukObjDescriptionEnTalukObjDescriptionKn);
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, commonUtilsToHtmlViewModelSelectedLanguageInt0TalukObjDescriptionEnTalukObjDescriptionKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByAir, viewModelSelectedLanguageInt0TalukObjByAirEnTalukObjByAirKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByRoad, viewModelSelectedLanguageInt0TalukObjByRoadEnTalukObjByRoadKn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvByTrain, viewModelSelectedLanguageInt0TalukObjByTrainEnTalukObjByTrainKn);
        }
        executeBindingsOn(incLayoutMap);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): incLayoutMap
        flag 1 (0x2L): talukObj
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.selectedLanguage == 0 ? talukObj.byAirEn : talukObj.byAirKn
        flag 5 (0x6L): viewModel.selectedLanguage == 0 ? talukObj.byAirEn : talukObj.byAirKn
        flag 6 (0x7L): viewModel.selectedLanguage == 0 ? talukObj.byRoadEn : talukObj.byRoadKn
        flag 7 (0x8L): viewModel.selectedLanguage == 0 ? talukObj.byRoadEn : talukObj.byRoadKn
        flag 8 (0x9L): viewModel.selectedLanguage == 0 ? talukObj.byTrainEn : talukObj.byTrainKn
        flag 9 (0xaL): viewModel.selectedLanguage == 0 ? talukObj.byTrainEn : talukObj.byTrainKn
        flag 10 (0xbL): viewModel.selectedLanguage == 0 ? talukObj.descriptionEn : talukObj.descriptionKn
        flag 11 (0xcL): viewModel.selectedLanguage == 0 ? talukObj.descriptionEn : talukObj.descriptionKn
    flag mapping end*/
    //end
}