package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTalukListBindingImpl extends FragmentTalukListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTalukListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentTalukListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvTalukList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((application.haveri.tourism.ui.fragment.taluk.taluk_list.TalukListFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.taluk.taluk_list.TalukListFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDistrict((androidx.lifecycle.MutableLiveData<application.haveri.tourism.data.model.api.response.haveri_data.District>) object, fieldId);
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
        application.haveri.tourism.ui.fragment.taluk.taluk_list.TalukListFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



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
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.addTalukItems(this.rvTalukList, viewModelDistrictTaluks);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.district
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}