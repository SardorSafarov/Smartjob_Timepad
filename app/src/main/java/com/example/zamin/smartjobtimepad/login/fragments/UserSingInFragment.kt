
import com.example.zamin.smartjobtimepad.BaseFragment
import com.example.zamin.smartjobtimepad.app.setGradiandColor
import com.example.zamin.smartjobtimepad.databinding.FragmentUserSingInBinding


class UserSingInFragment : BaseFragment<FragmentUserSingInBinding>(FragmentUserSingInBinding::inflate) {
    override fun onViewCreate() {
    binding.txt.setGradiandColor()
    binding.txt1.setGradiandColor()
        setOnClick()
    }

    private fun setOnClick() {
        binding.apply {

        }
    }

}