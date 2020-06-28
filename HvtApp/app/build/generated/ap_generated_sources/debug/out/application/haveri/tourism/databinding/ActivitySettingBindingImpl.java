package application.haveri.tourism.databinding;
import application.haveri.tourism.R;
import application.haveri.tourism.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySettingBindingImpl extends ActivitySettingBinding implements application.haveri.tourism.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"layout_toolbar"},
            new int[] {8},
            new int[] {application.haveri.tourism.R.layout.layout_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rv_theme_list, 9);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivitySettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[5]
            , (application.haveri.tourism.databinding.LayoutToolbarBinding) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.widget.Switch) bindings[1]
            , (android.widget.Switch) bindings[2]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[7]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[3]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[4]
            , (application.haveri.tourism.ui.custom.CustomTextView) bindings[6]
            );
        this.ivImageCache.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.switchNotificationDestination.setTag(null);
        this.switchNotificationEvents.setTag(null);
        this.tvAbout.setTag(null);
        this.tvLanguageEnglish.setTag(null);
        this.tvLanguageKannada.setTag(null);
        this.tvRate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new application.haveri.tourism.generated.callback.OnClickListener(this, 4);
        mCallback13 = new application.haveri.tourism.generated.callback.OnClickListener(this, 5);
        mCallback10 = new application.haveri.tourism.generated.callback.OnClickListener(this, 2);
        mCallback11 = new application.haveri.tourism.generated.callback.OnClickListener(this, 3);
        mCallback9 = new application.haveri.tourism.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((application.haveri.tourism.ui.activity.setting.SettingActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable application.haveri.tourism.ui.activity.setting.SettingActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
                return onChangeLayoutToolbar((application.haveri.tourism.databinding.LayoutToolbarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLayoutToolbar(application.haveri.tourism.databinding.LayoutToolbarBinding LayoutToolbar, int fieldId) {
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
        boolean viewModelSelectedLanguageInt0 = false;
        int viewModelSelectedLanguage = 0;
        boolean viewModelSelectedLanguageInt0BooleanTrueBooleanFalse = false;
        application.haveri.tourism.ui.activity.setting.SettingActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6L) != 0) {



                if (viewModel != null) {
                    // read viewModel.selectedLanguage
                    viewModelSelectedLanguage = viewModel.getSelectedLanguage();
                }


                // read viewModel.selectedLanguage == 0
                viewModelSelectedLanguageInt0 = (viewModelSelectedLanguage) == (0);
            if((dirtyFlags & 0x6L) != 0) {
                if(viewModelSelectedLanguageInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.selectedLanguage == 0 ? true : false
                viewModelSelectedLanguageInt0BooleanTrueBooleanFalse = ((viewModelSelectedLanguageInt0) ? (true) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.ivImageCache.setOnClickListener(mCallback11);
            this.tvAbout.setOnClickListener(mCallback13);
            this.tvLanguageEnglish.setOnClickListener(mCallback9);
            this.tvLanguageKannada.setOnClickListener(mCallback10);
            this.tvRate.setOnClickListener(mCallback12);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.switchNotificationDestination, viewModelSelectedLanguageInt0BooleanTrueBooleanFalse);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.switchNotificationEvents, viewModelSelectedLanguageInt0BooleanTrueBooleanFalse);
            application.haveri.tourism.utils.BindingUtils.setDrawableLeft(this.tvLanguageEnglish, viewModelSelectedLanguage);
            application.haveri.tourism.utils.BindingUtils.setDrawableLeft(this.tvLanguageKannada, viewModelSelectedLanguage);
        }
        executeBindingsOn(layoutToolbar);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.activity.setting.SettingActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onFeedBackClicked();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.activity.setting.SettingActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onAboutClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.activity.setting.SettingActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onLanguageClicked(application.haveri.tourism.utils.Language.KN);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.activity.setting.SettingActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clearImageCache();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                application.haveri.tourism.ui.activity.setting.SettingActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.onLanguageClicked(application.haveri.tourism.utils.Language.EN);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutToolbar
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.selectedLanguage == 0 ? true : false
        flag 4 (0x5L): viewModel.selectedLanguage == 0 ? true : false
    flag mapping end*/
    //end
}