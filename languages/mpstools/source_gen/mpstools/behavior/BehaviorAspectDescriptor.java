package mpstools.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBehaviorAspectDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.BHDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public final class BehaviorAspectDescriptor extends BaseBehaviorAspectDescriptor {
  private final BHDescriptor myIHasDeleteButton__BehaviorDescriptor = new IHasDeleteButton__BehaviorDescriptor();
  private final BHDescriptor myIntlLanguage__BehaviorDescriptor = new IntlLanguage__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt_a0f = concept;
    switch (index_846f5o_a0f.index(cncpt_a0f)) {
      case 0:
        return myIHasDeleteButton__BehaviorDescriptor;
      case 1:
        return myIntlLanguage__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex index_846f5o_a0f = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x2bedf8479e5786a1L), MetaIdFactory.conceptId(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x3581a114cbea3e7bL)).seal();
}
