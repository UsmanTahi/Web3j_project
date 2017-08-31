package com.example.aurora.myweb3j.contract;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.2.1.
 */
//contract wrapper
public final class ManageOrder extends Contract {
    private static final String BINARY = "0x6060604052341561000c57fe5b5b60008054600160a060020a03191633600160a060020a031617815560018190556002555b5b612d5b806100416000396000f300606060405236156100d55763ffffffff60e060020a60003504166303c1463c81146100fc57806326839f171461018c578063395ff584146101b357806340e161bf146102435780634122a29e146102d85780635e57966d146102ed578063653721471461038957806370ca32af146104195780638ac7d79c146104a95780638da5cb5b146104be5780639d4f621e146104ea578063b6e3069a1461057a578063bddc66f214610610578063c0044b8f146106a9578063d9183be51461073c578063e93956791461084b578063ef52c8c2146108de575b6100fa5b600160a060020a03331660009081526008602052604090208054340190555b565b005b341561010457fe5b61010c610937565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561019457fe5b61019f600435610c96565b604080519115158252519081900360200190f35b34156101bb57fe5b61010c610ce6565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561024b57fe5b6100fa600480803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284375050604080516020601f89358b01803591820183900483028401830190945280835297999881019791965091820194509250829150840183828082843750949650610d7f95505050505050565b005b34156102e057fe5b6100fa600435610e7d565b005b34156102f557fe5b61010c600160a060020a0360043516610f83565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561039157fe5b61010c611024565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561042157fe5b61010c6110b2565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156104b157fe5b6100fa6004356114d1565b005b34156104c657fe5b6104ce6115d7565b60408051600160a060020a039092168252519081900360200190f35b34156104f257fe5b61010c6115e6565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561058257fe5b61010c60ff600435166117f5565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561061857fe5b604080516020600460443581810135601f81018490048402850184019095528484526100fa94823594602480359560649492939190920191819084018382808284375050604080516020601f89358b0180359182018390048302840183019094528083529799988101979196509182019450925082915084018382808284375094965061186d95505050505050565b005b34156106b157fe5b61010c600435611ac5565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561074457fe5b6100fa600480803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284375050604080516020601f89358b0180359182018390048302840183019094528083529799988101979196509182019450925082915084018382808284375050604080516020601f89358b0180359182018390048302840183019094528083529799988101979196509182019450925082915084018382808284375050604080516020601f89358b01803591820183900483028401830190945280835297999881019791965091820194509250829150840183828082843750949650611e9995505050505050565b005b341561085357fe5b61010c600435612124565b604080516020808252835181830152835191928392908301918501908083838215610152575b80518252602083111561015257601f199092019160209182019101610132565b505050905090810190601f16801561017e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156108e657fe5b60408051602060046024803582810135601f81018590048502860185019096528585526100fa958335959394604494939290920191819084018382808284375094965061225095505050505050565b005b61093f612ac2565b6000610949612ad4565b6000610953612ac2565b61095b612ac2565b610963612ac2565b61096b612ac2565b610973612ac2565b60009750600095505b600154600101861015610bab5760008681526006602052604090206001015433600160a060020a03908116911614806109d2575060008681526006602052604090206002015433600160a060020a039081169116145b8015610a2b575060025b60008781526006602052604090206004015460ff1660038111156109fc57fe5b14158015610a2b575060035b60008781526006602052604090206004015460ff166003811115610a2857fe5b14155b5b8015610a385750600488105b15610b9f57600086815260066020526040902054610a5590612124565b600087815260066020526040902060030154909550610a7390612124565b600087815260066020526040902060040154909450610a949060ff166117f5565b9250610ab56006600088815260200190815260200160002060060154612124565b600087815260066020526040902060070154909250610ad390612124565b9050610b87610ae3868686612331565b6000888152600660209081526040918290206005018054835160026001831615610100026000190190921691909104601f810184900484028201840190945283815287938793919291830182828015610b7d5780601f10610b5257610100808354040283529160200191610b7d565b820191906000526020600020905b815481529060010190602001808311610b6057829003601f168201915b5050505050612545565b878960048110610b9357fe5b60200201526001909701965b5b60019095019461097c565b610be88760005b60200201518860015b60200201518960025b60200201518a60035b60200201516020604051908101604052806000815250612833565b8051610bfc91600591602090910190612b02565b506005805460408051602060026001851615610100026000190190941693909304601f81018490048402820184019092528181529291830182828015610c835780601f10610c5857610100808354040283529160200191610c83565b820191906000526020600020905b815481529060010190602001808311610c6657829003601f168201915b505050505098505b505050505050505090565b600160a060020a03331660009081526008602052604081205481901015610cbf57506000610ce1565b50600160a060020a033316600090815260086020526040902080548201905560015b919050565b610cee612ac2565b6005805460408051602060026001851615610100026000190190941693909304601f81018490048402820184019092528181529291830182828015610d745780601f10610d4957610100808354040283529160200191610d74565b820191906000526020600020905b815481529060010190602001808311610d5757829003601f168201915b505050505090505b90565b610d87612b81565b600160a060020a033316600090815260096020526040902054600260001961010060018416150201909116041515610e1c57506040805180820182528381526020808201849052600160a060020a033316600090815260098252929092208151805192938493610dfa9284920190612b02565b506020828101518051610e139260018501920190612b02565b50905050610e77565b600160a060020a03331660009081526009602090815260409091208451610e4592860190612b02565b50600160a060020a03331660009081526009602090815260409091208351610e7592600190920191850190612b02565b505b5b505050565b600081815260066020526040812060010154829033600160a060020a03908116911614610eaa5760006000fd5b600183815b60008281526006602052604090206004015460ff166003811115610ecf57fe5b14610eda5760006000fd5b600085815260066020526040902060040180546003919060ff19166001835b0217905550600085815260066020819052604080832060018101549201549051600160a060020a039092169650869281156108fc029290818181858888f193505050501515610f4457fe5b600085815260066020818152604080842092830154600190930154600160a060020a031684526008909152909120805490910190555b5b50505b505050565b610f8b612ac2565b610f93612ac2565b60006014604051805910610fa45750595b908082528060200260200182016040525b509150600090505b6014811015611019578060130360080260020a84600160a060020a0316811515610fe357fe5b0460f860020a028282815181101515610ff857fe5b906020010190600160f860020a031916908160001a9053505b600101610fbd565b8192505b5050919050565b6005805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156110aa5780601f1061107f576101008083540402835291602001916110aa565b820191906000526020600020905b81548152906001019060200180831161108d57829003601f168201915b505050505081565b6110ba612ac2565b60015b600254811161143f5760025460009081526007602052604090206001015433600160a060020a039081169116141561143657600280546000908152600760209081526040918290208301805483516001821615610100026000190190911694909404601f8101839004830285018301909352828452611420936112d593909283018282801561118d5780601f106111625761010080835404028352916020019161118d565b820191906000526020600020905b81548152906001019060200180831161117057829003601f168201915b505060028054600090815260076020908152604091829020600301805483516001821615610100026000190190911694909404601f8101839004830285018301909352828452929550919350915083018282801561122c5780601f106112015761010080835404028352916020019161122c565b820191906000526020600020905b81548152906001019060200180831161120f57829003601f168201915b505060028054600090815260076020908152604091829020600401805483516001821615610100026000190190911694909404601f810183900483028501830190935282845292955091935091508301828280156112cb5780601f106112a0576101008083540402835291602001916112cb565b820191906000526020600020905b8154815290600101906020018083116112ae57829003601f168201915b5050505050612331565b60028054600090815260076020908152604091829020600501805483516001821615610100026000190190911694909404601f8101839004830285018301909352828452919083018282801561136c5780601f106113415761010080835404028352916020019161136c565b820191906000526020600020905b81548152906001019060200180831161134f57829003601f168201915b505060028054600090815260076020908152604091829020600601805483516001821615610100026000190190911694909404601f8101839004830285018301909352828452929550919350915083018282801561140b5780601f106113e05761010080835404028352916020019161140b565b820191906000526020600020905b8154815290600101906020018083116113ee57829003601f168201915b505050505061141b600254612124565b612545565b805161143491600591602090910190612b02565b505b5b6001016110bd565b6005805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156114c55780601f1061149a576101008083540402835291602001916114c5565b820191906000526020600020905b8154815290600101906020018083116114a857829003601f168201915b505050505091505b5090565b600081815260066020526040812060010154829033600160a060020a039081169116146114fe5760006000fd5b600183815b60008281526006602052604090206004015460ff16600381111561152357fe5b1461152e5760006000fd5b600085815260066020526040902060040180546002919060ff19166001835b0217905550600085815260066020819052604080832060028101549201549051600160a060020a039092169650869281156108fc029290818181858888f19350505050151561159857fe5b600085815260066020818152604080842092830154600290930154600160a060020a031684526008909152909120805490910190555b5b50505b505050565b600054600160a060020a031681565b6115ee612ac2565b600160a060020a03331660009081526009602090815260409182902080548351601f6002600019610100600186161502019093169290920491820184900484028101840190945280845261174f939283018282801561168e5780601f106116635761010080835404028352916020019161168e565b820191906000526020600020905b81548152906001019060200180831161167157829003601f168201915b50505033600160a060020a0316600090815260096020908152604091829020600190810180548451600293821615610100026000190190911692909204601f810184900484028301840190945283825290945092508301828280156117345780601f1061170957610100808354040283529160200191611734565b820191906000526020600020905b81548152906001019060200180831161171757829003601f168201915b50505050506020604051908101604052806000815250612331565b805161176391600591602090910190612b02565b506005805460408051602060026001851615610100026000190190941693909304601f81018490048402820184019092528181529291830182828015610d745780601f10610d4957610100808354040283529160200191610d74565b820191906000526020600020905b815481529060010190602001808311610d5757829003601f168201915b505050505090505b90565b6117fd612ac2565b6000805b83600381111561180d57fe5b141561181b57506001611859565b60015b83600381111561182a57fe5b141561183857506002611859565b60025b83600381111561184757fe5b141561185557506003611859565b5060045b5b5b61186481612124565b91505b50919050565b611875612c38565b600160a060020a03331660009081526008602052604090205484908190101561189e5760006000fd5b856007600082815260200190815260200160002060040160405180828054600181600116156101000203166002900480156119105780601f106118ee576101008083540402835291820191611910565b820191906000526020600020905b8154815290600101906020018083116118fc575b50506040519081900390201515915061192b90505760006000fd5b6001805481018082556040805161010081018252918252600160a060020a0333811660208085019190915260008c81526007909152828120909401541690820152606081018990529060808201905b8152602080820187905260408083018a9052426060938401526001805460009081526006845282902085518155928501518382018054600160a060020a0319908116600160a060020a039384161790915592860151600285018054909416911617909155918301516003808301919091556080840151600483018054959850889593949193909260ff1990911691908490811115611a1457fe5b021790555060a08201518051611a34916005840191602090910190612b02565b5060c0820151600682015560e09091015160079182015560008881526020918252604090208651611a6d92600590920191880190612b02565b50600180546000908152600660208181526040808420850154600160a060020a031684526008825280842080548c90039055845484529190529020600401805460ff191682805b02179055505b5b505b505050505050565b611acd612ac2565b6000828152600760209081526040918290206002908101805484516001821615610100026000190190911692909204601f8101849004840283018401909452838252611df193611ca693830182828015611b685780601f10611b3d57610100808354040283529160200191611b68565b820191906000526020600020905b815481529060010190602001808311611b4b57829003601f168201915b5050506000878152600760209081526040918290206003018054835160026001831615610100026000190190921691909104601f810184900484028201840190945283815294509250830182828015611c025780601f10611bd757610100808354040283529160200191611c02565b820191906000526020600020905b815481529060010190602001808311611be557829003601f168201915b5050506000888152600760209081526040918290206004018054835160026001831615610100026000190190921691909104601f8101849004840282018401909452838152945092508301828280156112cb5780601f106112a0576101008083540402835291602001916112cb565b820191906000526020600020905b8154815290600101906020018083116112ae57829003601f168201915b5050505050612331565b60008481526007602090815260409182902060050180548351601f600260001961010060018616150201909316929092049182018490048402810184019094528084529091830182828015611d3c5780601f10611d1157610100808354040283529160200191611d3c565b820191906000526020600020905b815481529060010190602001808311611d1f57829003601f168201915b5050506000878152600760209081526040918290206006018054835160026001831615610100026000190190921691909104601f810184900484028201840190945283815294509250830182828015611dd65780601f10611dab57610100808354040283529160200191611dd6565b820191906000526020600020905b815481529060010190602001808311611db957829003601f168201915b50505050506020604051908101604052806000815250612545565b8051611e0591600591602090910190612b02565b506005805460408051602060026001851615610100026000190190941693909304601f81018490048402820184019092528181529291830182828015611e8c5780601f10611e6157610100808354040283529160200191611e8c565b820191906000526020600020905b815481529060010190602001808311611e6f57829003601f168201915b505050505090505b919050565b600060006000611ea7612c84565b60009350600191505b6002548211611ef85760025460009081526007602052604090206001015433600160a060020a0390811691161415611eec576001935060025492505b5b600190910190611eb0565b8315156120805760026000815480929190600101919050555060e060405190810160405280600254815260200133600160a060020a0316815260200189815260200188815260200187815260200160806040519081016040528060488152602001600080516020612d108339815191528152602001600080516020612d10833981519152815260200160c460020a670303030303030303028152508152602001868152509050806007600060025481526020019081526020016000206000820151816000015560208201518160010160006101000a815481600160a060020a030219169083600160a060020a031602179055506040820151816002019080519060200190612007929190612b02565b5060608201518051612023916003840191602090910190612b02565b506080820151805161203f916004840191602090910190612b02565b5060a0820151805161205b916005840191602090910190612b02565b5060c08201518051612077916006840191602090910190612b02565b50905050612119565b600083815260076020908152604090912089516120a5926002909201918b0190612b02565b50600083815260076020908152604090912088516120cb926003909201918a0190612b02565b50600083815260076020908152604090912087516120f192600490920191890190612b02565b506000838152600760209081526040909120865161211792600690920191880190612b02565b505b5b5050505050505050565b61212c612ac2565b6000612136612ac2565b60006000612142612ac2565b600060649550856040518059106121565750595b908082528060200260200182016040525b509450600093505b87156121be57600a885b069250600a885b0497508260300160f860020a0285858060010196508151811015156121a157fe5b906020010190600160f860020a031916908160001a90535061216f565b836001016040518059106121cf5750595b908082528060200260200182016040525b509150600090505b83811161224157848185038151811015156121ff57fe5b90602001015160f860020a900460f860020a02828281518110151561222057fe5b906020010190600160f860020a031916908160001a9053505b6001016121e8565b8196505b505050505050919050565b816007600082815260200190815260200160002060040160405180828054600181600116156101000203166002900480156122c25780601f106122a05761010080835404028352918201916122c2565b820191906000526020600020905b8154815290600101906020018083116122ae575b5050604051908190039020151591506122dd90505760006000fd5b60008381526007602052604090206001015433600160a060020a0390811691161415610e775760008381526007602090815260409091208351610e7592600590920191850190612b02565b505b5b5b505050565b612339612ac2565b612341612ac2565b612349612ac2565b612351612ac2565b612359612ac2565b612361612ac2565b600060008a965089955088945084518651885101016003016040518059106123865750595b908082528060200260200182016040525b50935083925060009150600090505b86518110156124055786818151811015156123bd57fe5b90602001015160f860020a900460f860020a0283838060010194508151811015156123e457fe5b906020010190600160f860020a031916908160001a9053505b6001016123a6565b8251600183019260f960020a60150291859190811061242057fe5b906020010190600160f860020a031916908160001a905350600090505b855181101561249c57858181518110151561245457fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561247b57fe5b906020010190600160f860020a031916908160001a9053505b60010161243d565b8251600183019260f960020a6015029185919081106124b757fe5b906020010190600160f860020a031916908160001a905350600090505b84518110156125335784818151811015156124eb57fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561251257fe5b906020010190600160f860020a031916908160001a9053505b6001016124d4565b8297505b505050505050509392505050565b61254d612ac2565b612555612ac2565b61255d612ac2565b612565612ac2565b61256d612ac2565b612575612ac2565b61257d612ac2565b600060008c97508b96508a95508994508451865188518a510101016004016040518059106125a85750595b908082528060200260200182016040525b50935083925060009150600090505b87518110156126275787818151811015156125df57fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561260657fe5b906020010190600160f860020a031916908160001a9053505b6001016125c8565b8251600183019260f960020a60150291859190811061264257fe5b906020010190600160f860020a031916908160001a905350600090505b86518110156126be57868181518110151561267657fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561269d57fe5b906020010190600160f860020a031916908160001a9053505b60010161265f565b8251600183019260f960020a6015029185919081106126d957fe5b906020010190600160f860020a031916908160001a905350600090505b855181101561275557858181518110151561270d57fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561273457fe5b906020010190600160f860020a031916908160001a9053505b6001016126f6565b8251600183019260f960020a60150291859190811061277057fe5b906020010190600160f860020a031916908160001a905350600090505b84518110156127ec5784818151811015156127a457fe5b90602001015160f860020a900460f860020a0283838060010194508151811015156127cb57fe5b906020010190600160f860020a031916908160001a9053505b60010161278d565b8251600183019260f860020a60250291859190811061280757fe5b906020010190600160f860020a031916908160001a9053508298505b5050505050505050949350505050565b61283b612ac2565b612843612ac2565b61284b612ac2565b612853612ac2565b61285b612ac2565b612863612ac2565b61286b612ac2565b612873612ac2565b600060008e98508d97508c96508b95508a94508451865188518a518c51010101016040518059106128a15750595b908082528060200260200182016040525b50935083925060009150600090505b88518110156129205788818151811015156128d857fe5b90602001015160f860020a900460f860020a0283838060010194508151811015156128ff57fe5b906020010190600160f860020a031916908160001a9053505b6001016128c1565b5060005b875181101561298357878181518110151561293b57fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561296257fe5b906020010190600160f860020a031916908160001a9053505b600101612924565b5060005b86518110156129e657868181518110151561299e57fe5b90602001015160f860020a900460f860020a0283838060010194508151811015156129c557fe5b906020010190600160f860020a031916908160001a9053505b600101612987565b5060005b8551811015612a49578581815181101515612a0157fe5b90602001015160f860020a900460f860020a028383806001019450815181101515612a2857fe5b906020010190600160f860020a031916908160001a9053505b6001016129ea565b5060005b8451811015612aac578481815181101515612a6457fe5b90602001015160f860020a900460f860020a028383806001019450815181101515612a8b57fe5b906020010190600160f860020a031916908160001a9053505b600101612a4d565b8299505b50505050505050505095945050505050565b60408051602081019091526000815290565b6080604051908101604052806004905b612aec612ac2565b815260200190600190039081612ae45790505090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10612b4357805160ff1916838001178555612b70565b82800160010185558215612b70579182015b82811115612b70578251825591602001919060010190612b55565b5b506114cd929150612cee565b5090565b604060405190810160405280612b95612ac2565b8152602001612ba2612ac2565b905290565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10612b4357805160ff1916838001178555612b70565b82800160010185558215612b70579182015b82811115612b70578251825591602001919060010190612b55565b5b506114cd929150612cee565b5090565b60408051602081019091526000815290565b6040805161010081018252600080825260208201819052918101829052606081018290529060808201905b8152602001612c70612ac2565b815260200160008152602001600081525090565b6040805160e08101825260008082526020820152908101612ca3612ac2565b8152602001612cb0612ac2565b8152602001612cbd612ac2565b8152602001612b95612ac2565b8152602001612ba2612ac2565b905290565b60408051602081019091526000815290565b610d7c91905b808211156114cd5760008155600101612cf4565b5090565b9056003030303030303030303030303030303030303030303030303030303030303030a165627a7a72305820031171174b9f059642bece82a9a20bd6be729a4c2b49557e41466fc1055940470029";

    private ManageOrder(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private ManageOrder(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<TransactionReceipt> listedOrder() {
        Function function = new Function("listedOrder", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> depositEther(Uint256 _value) {
        Function function = new Function("depositEther", Arrays.<Type>asList(_value), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Utf8String> uintto() {
        Function function = new Function("uintto", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> newBuyer(Utf8String _name, Utf8String _phone) {
        Function function = new Function("newBuyer", Arrays.<Type>asList(_name, _phone), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> abortOrder(Uint256 order_no) {
        Function function = new Function("abortOrder", Arrays.<Type>asList(order_no), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> addressToString(Address x) {
        Function function = new Function("addressToString", Arrays.<Type>asList(x), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Utf8String> result() {
        Function function = new Function("result", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> numParking() {
        Function function = new Function("numParking", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> confirmOrder(Uint256 order_no) {
        Function function = new Function("confirmOrder", Arrays.<Type>asList(order_no), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Address> owner() {
        Function function = new Function("owner", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> queryBuyer() {
        Function function = new Function("queryBuyer", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> enumToString(Uint8 _state) {
        Function function = new Function("enumToString", 
                Arrays.<Type>asList(_state), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> newOrder(Uint256 _parkingNo, Uint256 _price, Utf8String _avail_hour, Utf8String _new_hour) {
        Function function = new Function("newOrder", Arrays.<Type>asList(_parkingNo, _price, _avail_hour, _new_hour), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> queryParking(Uint256 _parkingNo) {
        Function function = new Function("queryParking", Arrays.<Type>asList(_parkingNo), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> newParking(Utf8String _name, Utf8String _phone, Utf8String _post_code, Utf8String _park_address) {
        Function function = new Function("newParking", Arrays.<Type>asList(_name, _phone, _post_code, _park_address), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Utf8String> uintToString(Uint256 v) {
        Function function = new Function("uintToString", 
                Arrays.<Type>asList(v), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> manageParking(Uint256 _parkingNo, Utf8String _avail_hour) {
        Function function = new Function("manageParking", Arrays.<Type>asList(_parkingNo, _avail_hour), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<ManageOrder> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(ManageOrder.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<ManageOrder> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(ManageOrder.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static ManageOrder load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ManageOrder(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static ManageOrder load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ManageOrder(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
