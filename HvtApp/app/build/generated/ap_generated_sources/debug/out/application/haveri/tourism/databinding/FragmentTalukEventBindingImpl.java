package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTalukEventBindingImpl extends FragmentTalukEventBinding  {

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
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTalukEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentTalukEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvEventList.setTag(null);
        this.tvNoData.setTag(null);
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
            setViewModel((application.haveri.tourism.ui.fragment.taluk.taluk_detail.events.TalukEventFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.fragment.taluk.taluk_detail.events.TalukEventFragmentViewModel ViewModel) {
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
                return onChangeViewModelTalukEventList((androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Event>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTalukEventList(androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Event>> ViewModelTalukEventList, int fieldId) {
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
        int viewModelTalukEventListSize = 0;
        boolean viewModelTalukEventListSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Event>> viewModelTalukEventList = null;
        java.util.List<application.haveri.tourism.data.model.api.response.haveri_data.Event> viewModelTalukEventListGetValue = null;
        int viewModelTalukEventListSizeInt0ViewGONEViewVISIBLE = 0;
        application.haveri.tourism.ui.fragment.taluk.taluk_detail.events.TalukEventFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.talukEventList
                    viewModelTalukEventList = viewModel.getTalukEventList();
                }
                updateLiveDataRegistration(0, viewModelTalukEventList);


                if (viewModelTalukEventList != null) {
                    // read viewModel.talukEventList.getValue()
                    viewModelTalukEventListGetValue = viewModelTalukEventList.getValue();
                }


                if (viewModelTalukEventListGetValue != null) {
                    // read viewModel.talukEventList.getValue().size()
                    viewModelTalukEventListSize = viewModelTalukEventListGetValue.size();
                }


                // read viewModel.talukEventList.getValue().size() > 0
                viewModelTalukEventListSizeInt0 = (viewModelTalukEventListSize) > (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelTalukEventListSizeInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.talukEventList.getValue().size() > 0 ? View.GONE : View.VISIBLE
                viewModelTalukEventListSizeInt0ViewGONEViewVISIBLE = ((viewModelTalukEventListSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            application.haveri.tourism.utils.BindingUtils.addEventItems(this.rvEventList, viewModelTalukEventListGetValue);
            this.tvNoData.setVisibility(viewModelTalukEventListSizeInt0ViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.talukEventList
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.talukEventList.getValue().size() > 0 ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewModel.talukEventList.getValue().size() > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}