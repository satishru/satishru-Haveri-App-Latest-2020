package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(0, 
            new String[] {"about_bottom_sheet"},
            new int[] {4},
            new int[] {application.haveri.tourism.R.layout.about_bottom_sheet});
        sIncludes.setIncludes(2, 
            new String[] {"fragment_home_content"},
            new int[] {3},
            new int[] {application.haveri.tourism.R.layout.fragment_home_content});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 5);
        sViewsWithIds.put(R.id.toolbar_layout, 6);
        sViewsWithIds.put(R.id.image_slider, 7);
        sViewsWithIds.put(R.id.constraintLayout, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (application.haveri.tourism.databinding.AboutBottomSheetBinding) bindings[4]
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.ImageView) bindings[1]
            , (com.smarteist.autoimageslider.SliderView) bindings[7]
            , (application.haveri.tourism.databinding.FragmentHomeContentBinding) bindings[3]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[6]
            );
        this.expandedImage.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.core.widget.NestedScrollView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        layoutContent.invalidateAll();
        aboutBottomSheet.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutContent.hasPendingBindings()) {
            return true;
        }
        if (aboutBottomSheet.hasPendingBindings()) {
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutContent.setLifecycleOwner(lifecycleOwner);
        aboutBottomSheet.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDistrict((androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.District>) object, fieldId);
            case 1 :
                return onChangeLayoutContent((application.haveri.tourism.databinding.FragmentHomeContentBinding) object, fieldId);
            case 2 :
                return onChangeAboutBottomSheet((application.haveri.tourism.databinding.AboutBottomSheetBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDistrict(androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.District> ViewModelDistrict, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutContent(application.haveri.tourism.databinding.FragmentHomeContentBinding LayoutContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAboutBottomSheet(application.haveri.tourism.databinding.AboutBottomSheetBinding AboutBottomSheet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        application.haveri.tourism.data.model.api.response.haveri_data.District viewModelDistrictGetValue = null;
        androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.District> viewModelDistrict = null;
        java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Taluk> viewModelDistrictTaluks = null;
        application.haveri.tourism.ui.fragment.home.HomeFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x19L) != 0) {



                if (viewModel != null) {
                    // read viewModel.district
                    viewModelDistrict = viewModel.getDistrict();
                }
                updateLiveDataRegistration(0, viewModelDistrict);


                if (viewModelDistrict != null) {
                    // read viewModel.district.getValue()
                    viewModelDistrictGetValue = viewModelDistrict.getValue();
                }


                if (viewModelDistrictGetValue != null) {
                    // read viewModel.district.getValue().taluks
                    viewModelDistrictTaluks = viewModelDistrictGetValue.getTaluks();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.aboutBottomSheet.setViewModel(viewModel);
            this.layoutContent.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.setImageUrlSafeLoad(this.expandedImage, viewModelDistrictTaluks);
        }
        executeBindingsOn(layoutContent);
        executeBindingsOn(aboutBottomSheet);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.district
        flag 1 (0x2L): layoutContent
        flag 2 (0x3L): aboutBottomSheet
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}